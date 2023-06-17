import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLeaders {

    public static ArrayList<Integer> findLeaders(int[] nums) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxRight = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > maxRight) {
                leaders.add(nums[i]);
                maxRight = nums[i];
            }
        }

        return leaders;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        ArrayList<Integer> leaders = findLeaders(nums);
        System.out.println("Leaders in the array: " + leaders);

        scanner.close();
    }
}
