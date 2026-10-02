package Level3;

import java.util.Scanner;

public class SumNaturalNumUptoUserInput {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        int count=0;
        for(int i =1;i<=num;i++)
            count+=i;
        System.out.printf("Sum of all Natural number upto %d is %d ",num, count);
    }
}
