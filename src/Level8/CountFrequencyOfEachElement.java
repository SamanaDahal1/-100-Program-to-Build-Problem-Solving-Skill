package Level8;

import java.util.Scanner;

public class CountFrequencyOfEachElement {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = src.nextInt();
        int[] list = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < list.length; i++) {
            list[i] = src.nextInt();
        }
        for (int i = 0; i < list.length; i++) {
            int count = 0;
            boolean result = false;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    result = true;
                    break;
                }
            }
            if (!result) {
                for (int j = 0; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        count++;
                    }
                }
                System.out.println(list[i] + "=" + count + " times");
            }
        }
    }
}