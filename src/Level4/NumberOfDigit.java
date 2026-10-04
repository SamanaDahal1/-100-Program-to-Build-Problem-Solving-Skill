package Level4;

import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        String a = String.valueOf(num);
        System.out.println(a.length());
    }
}
