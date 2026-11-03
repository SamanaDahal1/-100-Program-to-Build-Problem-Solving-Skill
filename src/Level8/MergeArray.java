package Level8;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5,6};
        int[] list2 = {7,8,9,10,11,12};
        int[] merge = new int[list1.length+ list2.length];
        System.out.println("Elements of first array");
        for(int list : list1){
            System.out.print(list +" ");
        }
        System.out.println("\nElements of second array");
        for(int list : list2){
            System.out.print(list +" ");
        }
        for (int i=0;i<list1.length;i++){
            merge[i] =list1[i];
        }
        for (int i=0; i< list2.length;i++){
            merge[list1.length+i]=list2[i];
        }
        System.out.println("\nAfter Merging");
        for(int merges:merge){
            System.out.print(merges + " ");
        }

    }
}
