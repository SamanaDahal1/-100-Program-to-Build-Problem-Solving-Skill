package Level2;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args){{
            Scanner src = new Scanner(System.in);
            System.out.print("Enter a year: ");
            int year = src.nextInt();
            if (year % 400 == 0) {
                System.out.println(year + " is a leap year");
            }
            else if (year % 4 ==0 && year%100!=0) {
                System.out.println(year + " is a leap year");
            }
            else{
                System.out.println(year + " isnt a leap year");
            }
        }
    }
}
