package Level8;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = src.nextInt();
        int[] list = new int[size];
        int countEven = 0;
        int countOdd = 0;
        System.out.println("Enter array elements:");
        for (int i = 0; i < list.length; i++) {
            list[i] = src.nextInt();
        }
        for(int i=0;i<list.length;i++) {
            if(list[i]%2==0){
                countEven++;
            }
        }
        for(int i=0;i<list.length;i++) {
            if (list[i] % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println("Even: "+ countEven);
        System.out.println("Odd: "+countOdd);
    }

}

