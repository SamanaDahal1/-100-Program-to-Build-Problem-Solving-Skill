package Level5;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter your 1st number: ");
        int num1 = src.nextInt();
        System.out.print("Enter your 1st number: ");
        int num2= src.nextInt();
        int store=0;
        for (int i = 1; i <= num1&& i <= num2; i++) {
            if (num1 % i == 0 && num2%i==0) {
                store=i;
            }
        }
        System.out.println(store);

    }
}
