package RecursionAndBackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = sum(arr, arr.length - 1);
        System.out.println(sum);

    }
    public static int sum(int[] arr, int index) {
        if (index < 0) {
            return 0;
        }
            return arr[index] + sum(arr, index - 1);
    }
}
