package Level4;

import java.util.Scanner;

public class SumOfAllUserInputDigit {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = src.next();
        int count=0;
        for(int i =0 ; i<num.length();i++){
           count+=num.charAt(i)-'0';
        }
        System.out.print(count);
    }

}
