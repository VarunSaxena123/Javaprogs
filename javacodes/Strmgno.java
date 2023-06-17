import java.util.Scanner;

public class StrobogrammaticNumber {

    public static boolean isStrobogrammatic(String number) {
        int leftIndex = 0;
        int rightIndex = number.length() - 1;

        while (leftIndex <= rightIndex) {
            char leftChar = number.charAt(leftIndex);
            char rightChar = number.charAt(rightIndex);

            if (isStrobogrammaticPair(leftChar, rightChar)) {
                leftIndex++;
                rightIndex--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean isStrobogrammaticPair(char leftChar, char rightChar) {
        return (leftChar == '0' && rightChar == '0')
                || (leftChar == '1' && rightChar == '1')
                || (leftChar == '6' && rightChar == '9')
                || (leftChar == '8' && rightChar == '8')
                || (leftChar == '9' && rightChar == '6');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.next();

        boolean isStrobogrammatic = isStrobogrammatic(number);

        if (isStrobogrammatic) {
            System.out.println(number + " is a strobogrammatic number.");
        } else {
            System.out.println(number + " is not a strobogrammatic number.");
        }

        scanner.close();
    }
}
