package Level6;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter height: ");
        int num = src.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 1; j <(num - i); j++) {
                System.out.print(" ");
            }
            int store = 1;
            for (int a = 0; a <= i; a++) {
                System.out.print(store + "   ");
                store = store * (i - a) / (a + 1);
            }
            System.out.println();
        }
    }
}