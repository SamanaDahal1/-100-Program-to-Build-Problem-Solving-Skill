package Level6;

import java.util.Scanner;

public class FirstnTermOfFibonacci {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("How many number you want: ");
        int num = src.nextInt();
        int a=0;
        int b= 1;
        int c=0;
        for(int i = 0; i<=num;i++){
           c=a+b;
           System.out.println(a);
           a=b;
           b=c;

        }

    }
}
