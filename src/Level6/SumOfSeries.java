package Level6;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a number upto which you need sum of: ");
        int num= src.nextInt();
        int count =0 ;
        for(int i = 0 ; i<=num;i++){
            count+=i;
        }
        System.out.println(count);
    }
}
