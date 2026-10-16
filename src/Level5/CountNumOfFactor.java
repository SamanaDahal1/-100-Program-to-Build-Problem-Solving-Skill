package Level5;

import java.util.Scanner;

public class CountNumOfFactor {
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner src= new Scanner(System.in);
        int num = src.nextInt();
        int count =0;
        for(int i =1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
