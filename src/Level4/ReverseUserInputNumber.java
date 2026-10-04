package Level4;

import java.util.Scanner;

public class ReverseUserInputNumber {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        int store=0;
        while (num>0){
            store=store * 10 + num % 10;
            num/=10;
        }
        System.out.print(store);
    }
}
