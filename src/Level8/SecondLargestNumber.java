package Level8;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = src.nextInt();
        int[] list = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < list.length; i++) {
            list[i] = src.nextInt();
        }
        int storeLarge = list[0];
        int secondLarge=Integer.MIN_VALUE;
        for(int i=0;i<list.length;i++) {
            if(list[i]>storeLarge){
                storeLarge=list[i];
            }
    }
        for (int i = 0; i < list.length; i++) {
            if (list[i] < storeLarge&& list[i] > secondLarge) {
                secondLarge= list[i];
            }
        }
        System.out.println("Second largest number: "+secondLarge);
}
}