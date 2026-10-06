package Level4;

import java.util.Scanner;

public class OddEvenInaNumber {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a Number more than 1 digit: ");
        int num = src.nextInt();
        while(num>0){
            int store = num%10;
            if(store%2==0) {
                System.out.println("Even: "+ store);
            }
            else {
               System.out.println("Odd: "+ store);

            }
            num=num/10;
        }


    }
}
