package Level6;

import java.util.Scanner;

public class SumOfFractions {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a number upto which you need sum of: ");
        double num= src.nextInt();
        double count =0.0 ;
        for(int i = 1 ; i<=num;i++){
            double a =1.0/i;
            count+=a;
        }
        System.out.println(count);
    }
}
