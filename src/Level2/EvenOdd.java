package Level2;

import java.util.Scanner;

public class EvenOdd {
    public  static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter number to check even or odd: ");
        int num = src.nextInt();;
        if(num%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
