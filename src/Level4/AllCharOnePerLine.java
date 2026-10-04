package Level4;

import java.util.Scanner;

public class AllCharOnePerLine {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = src.next();
        for(int i =0;i<num.length();i++){
            System.out.println(num.charAt(i));
        }
    }
}
