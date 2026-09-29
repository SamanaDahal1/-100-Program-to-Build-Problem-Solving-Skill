package Level2;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.println("Enter number to check whether it is positive negetive or zero: ");
        int num = src.nextInt();
        if(num>0){
            System.out.println("Number is positive");
        }
        else if (num<0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is Zero");
        }
    }
}
