package Level5;

import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = src.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
