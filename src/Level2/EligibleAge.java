package Level2;

import java.util.Scanner;

public class EligibleAge {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = src.nextInt();
        if(age<18){
            System.out.println("You can't Vote");
        }
        else {
            System.out.println("You can Vote");
        }
    }
}
