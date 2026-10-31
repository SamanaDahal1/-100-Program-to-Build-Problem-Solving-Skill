package Level8;

import java.util.Scanner;

public class SumAverageArray {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = src.nextInt();
        int[] list = new int[size];
        int sum = 0;
        System.out.println("Enter array elements:");
        for (int i = 0; i < list.length; i++) {
            list[i] = src.nextInt();
            sum += list[i];
        }
        double average = (double) sum / size;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}