package Level8;

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = src.nextInt();
        int[] list = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < list.length; i++) {
            list[i] = src.nextInt();
        }
        boolean found = false;
        System.out.print("Enter element which you want to search: ");
        int search = src.nextInt();
        for (int i = 0; i < list.length; i++) {
            if(list[i]==search){
                System.out.println("Element Found: ");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Element Not Found");
        }
    }
}
