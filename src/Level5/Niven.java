package Level5;

import java.util.Scanner;

public class Niven {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Entre your number: ");
        int num = src.nextInt();
        int og = num;
        int count=0;
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            count+=digit;

        }
        if(og%count==0){
            System.out.println("Niven Number");
        }
        else {
            System.out.println("Not Niven Number");
        }

    }
}
