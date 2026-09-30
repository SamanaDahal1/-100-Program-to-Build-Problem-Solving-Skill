package Level2;

import java.util.Scanner;

public class DivisibleOrNot {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Divisible by 3 and 5");
        }
        else {
            System.out.println("Not Divisible by 3 and 5");
        }
    }
}
