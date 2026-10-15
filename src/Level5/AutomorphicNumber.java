package Level5;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = src.nextInt();
        int square = num * num;
        int og= num;
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        int div = 1;
        for (int i = 0; i < count; i++) {
            div = div * 10;
        }

        if (square % div == og) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not Automorphic Number");
        }

    }
}
