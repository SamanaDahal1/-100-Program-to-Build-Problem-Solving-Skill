package Level8;

import java.util.Scanner;

public class RemoveDup {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = src.nextInt();
        int[] list = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < list.length; i++) {
            list[i] = src.nextInt();
        }
        System.out.println("Removing duplicate: ");
        for (int i = 0; i < list.length; i++) {
            boolean result = false;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    result = true;
                    break;
                }
            }
            if (!result) {
               System.out.print(list[i]+" ");
                }
    }
}
    }
