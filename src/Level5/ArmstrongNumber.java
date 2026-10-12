package Level5;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        int og = num;
        int count = 0;

        int size = 0;
        int temp = Math.abs(og);

        while (temp > 0) {
            size++;
            temp = temp / 10;
        }

        while (num > 0) {
            int dig = num % 10;
            int store = 1;

            for (int i = 0; i < size; i++) {
                store = store * dig;
            }

            count += store;
            num = num / 10;
        }

        if (count == og) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
