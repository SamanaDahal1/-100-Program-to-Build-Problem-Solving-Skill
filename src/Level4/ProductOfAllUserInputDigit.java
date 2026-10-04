package Level4;

import java.util.Scanner;

public class ProductOfAllUserInputDigit {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = src.next();
        int pro =1;
        for(int i = 0 ; i<num.length();i++){
            pro*=num.charAt(i)-'0' ;

        }
        System.out.print(pro);

    }
}
