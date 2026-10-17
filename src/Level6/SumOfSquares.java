package Level6;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a number upto which you need sum of: ");
        int num= src.nextInt();
        int count =0 ;
        for(int i = 1 ; i<=num;i++){
            int a =i*i;
            count+=a;
        }
        System.out.println(count);
    }
}
