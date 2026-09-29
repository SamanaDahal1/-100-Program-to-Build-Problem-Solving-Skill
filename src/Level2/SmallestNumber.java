package Level2;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args){
            Scanner src = new Scanner(System.in);
            System.out.print("Enter your 1st number: ");
            int num = src.nextInt();
            System.out.print("Enter your 2nd number: ");
            int num2 = src.nextInt();
            System.out.print("Enter your 3rd number: ");
            int num3 = src.nextInt();
            if(num>num2 && num3>num2){
                System.out.println("Smallest Number is: "+ num2);
            }
            else if(num<num2 && num3>num){
                System.out.println("Smallest Number is: "+ num);
            }
            else {
                System.out.println("Smallest Number is: "+ num3);
            }
        }
    }

