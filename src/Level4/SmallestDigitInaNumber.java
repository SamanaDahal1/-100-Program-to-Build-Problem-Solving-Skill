package Level4;

import java.util.Scanner;

public class SmallestDigitInaNumber {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = src.nextInt();
        int small = num%10;
        while(num>0){
            if(num%10<small){
                small=num%10;
            }
            num= num/10;
        }
        System.out.println(small);

    }
}
