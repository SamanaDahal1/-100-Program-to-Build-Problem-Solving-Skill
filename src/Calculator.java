import java.util.Scanner;
// Write a program to read two numbers and print their sum, difference, product and quotient.
public class Calculator {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your 1st number: ");
        double a = src.nextDouble();
        System.out.print("Enter your 2st number: ");
        double b = src.nextDouble();
        System.out.println( a+b);
        System.out.println( a-b);
        System.out.println( a*b);
        System.out.println( a%b);


    }
}
