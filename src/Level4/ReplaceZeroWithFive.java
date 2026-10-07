package Level4;

import java.util.Scanner;

public class ReplaceZeroWithFive {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = src.nextInt();
        int store=0;

        while(num>0){
            int dig = num%10;
            if(dig==0){
                dig=5;
            }
            store= store* 10 +dig;
            num= num/10;
        }
        System.out.println(store);
    }
}
