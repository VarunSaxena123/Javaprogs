import java.math.BigInteger;
import java.util.Scanner;

public class ChineseRemainderTheorem {

    public static BigInteger findSolution(BigInteger[] moduli, BigInteger[] remainders) {
        BigInteger product = BigInteger.ONE;
        for (BigInteger modulus : moduli) {
            product = product.multiply(modulus);
        }

        BigInteger solution = BigInteger.ZERO;
        for (int i = 0; i < moduli.length; i++) {
            BigInteger partialProduct = product.divide(moduli[i]);
            BigInteger inverse = partialProduct.modInverse(moduli[i]);
            solution = solution.add(remainders[i].multiply(partialProduct).multiply(inverse));
        }

        return solution.mod(product);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of congruences: ");
        int numCongruences = scanner.nextInt();

        BigInteger[] moduli = new BigInteger[numCongruences];
        BigInteger[] remainders = new BigInteger[numCongruences];

        System.out.println("Enter the moduli and remainders:");

        for (int i = 0; i < numCongruences; i++) {
            System.out.print("Modulus " + (i + 1) + ": ");
            moduli[i] = scanner.nextBigInteger();

            System.out.print("Remainder " + (i + 1) + ": ");
            remainders[i] = scanner.nextBigInteger();
        }

        BigInteger solution = findSolution(moduli, remainders);
        System.out.println("Solution: " + solution);

        scanner.close();
    }
}
