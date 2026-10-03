package Level3;

import java.util.Scanner;

public class FactorialOfUserInput {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a numbet: ");
        int num = src.nextInt();
        int a=1;
        for(int i= 1;i<=num;i++){
            a*=i;
        }
        System.out.println(a);
    }
}
