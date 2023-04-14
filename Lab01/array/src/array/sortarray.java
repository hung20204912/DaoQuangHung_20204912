package array;
import java.util.Arrays;
import java.util.Scanner;

public class sortarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        int sum = 0;
        double average = 0;

        for (int num : numbers) {
            sum += num;
        }

        if (numbers.length > 0) {
            average = (double) sum / numbers.length;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        input.close();
    }
}


