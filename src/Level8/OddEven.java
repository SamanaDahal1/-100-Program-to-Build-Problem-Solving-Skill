package Level8;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = src.nextInt();
        int[] list = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < list.length; i++) {
            list[i] = src.nextInt();
        }
        System.out.println("Even: ");
        for(int i=0;i<list.length;i++) {
            if(list[i]%2==0){
                System.out.print(list[i] +" ");
            }
        }
        System.out.println("\nOdd: ");
        for(int i=0;i<list.length;i++) {
            if (list[i] % 2 != 0) {
                System.out.print(list[i] + " ");
            }
        }
    }

}

