package Level8;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = src.nextInt();
        String[] list = new String[size];
        System.out.println("Enter element: ");
        for(int i=0;i<list.length;i++){
            list[i] = src.next();
        }
        for(int i= list.length-1;i>=0;i--){
            System.out.print(list[i]+ " ");
        }


    }
}
