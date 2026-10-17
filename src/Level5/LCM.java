package Level5;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your 1st number: ");
        int num1 = src.nextInt();
        System.out.print("Enter your 1st number: ");
        int num2= src.nextInt();
        int store=0;
        for (int i = 1; ; i++) {
            if (i % num1==0 && i %num2==0) {
                store=i;
                break;
            }
        }
        System.out.println(store);

    }
}
