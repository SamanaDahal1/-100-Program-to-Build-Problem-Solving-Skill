package Level1;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void  main(String[] args){
        Scanner src = new Scanner(System.in );
        System.out.print("Enter Celsius: ");
        double celsius = src.nextDouble();
        double fahrenheit = (celsius*9/5)+32;
        System.out.println("Fahrenheit: "+ fahrenheit +"f");

    }
}
