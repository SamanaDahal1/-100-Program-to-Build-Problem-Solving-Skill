package Level8;

import java.util.Scanner;

public class BubbleAscSort {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = src.nextInt();
        int[] list = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < list.length; i++) {
            list[i] = src.nextInt();
        }
        for(int i=0;i< list.length-1;i++){
            for(int j =0 ;j< list.length-1;j++){
                if(list[j]>list[j+1]){
                    int temp = list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted: ");
        for(int i = 0;i< list.length;i++){
            System.out.print(list[i]+" ");
        }
    }
}
