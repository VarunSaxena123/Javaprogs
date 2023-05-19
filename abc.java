import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isabc(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        
        scanner.close();
    }
    
    public static boolean isabc(int number) {
        int sum = 0;
        
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum == number;
    }
}
