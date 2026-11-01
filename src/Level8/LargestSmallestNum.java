package Level8;

import java.util.Scanner;

public class LargestSmallestNum {
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
        int storeSmall =list[0];
        for(int i=0;i<list.length;i++) {
           if(list[i]>storeLarge){
               storeLarge=list[i];
           }
           if(list[i]<storeSmall){
               storeSmall=list[i];
           }
        }
        System.out.println("Largest Number: " +storeLarge);
        System.out.println("Smallest Number: "+ storeSmall);

    }
}
