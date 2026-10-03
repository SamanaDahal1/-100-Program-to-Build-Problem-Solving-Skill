package Level3;

import java.util.Scanner;

public class MultiplicationOfUserInputNumber {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        for(int i = 1;i<=10;i++){
            int store =num*i;
            System.out.println("2 " + "* "+i +"= "+ store);
        }
    }
}
