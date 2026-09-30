package Level2;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int marks = src.nextInt();
        if(marks >=80 && marks<=100){
            System.out.println("A");
        }
        else if (marks >=60 && marks<80) {
            System.out.println("B");
        }
        else if (marks >=40 && marks<60) {
            System.out.println("C");
        }
        else if (marks >=25 && marks<40) {
            System.out.println("D");
        }
        else if (marks >=0 && marks<25) {
            System.out.println("Fail");
        }
        else {
            System.out.println("Invalid Input");
        }

    }
}
