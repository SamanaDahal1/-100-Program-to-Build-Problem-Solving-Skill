package Level6;

import java.util.Scanner;

public class SumOfFibpnacci {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("How many number you want: ");
        int num = src.nextInt();
        int a=0;
        int b= 1;
        int c;
        int count=0;
        for(int i = 0; i<num;i++){
            count+=a;
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(count);
    }
}
