package Level9;

import java.util.Scanner;

public class PrimeFromAToBFunction {
    void rangePrime(int a, int b) {
        for (int i = a; i <= b; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;

                }
            }
            if (count == 2) {
                System.out.println(i);
            }


        }
    }
        public static void main (String[]args){
            Scanner src = new Scanner(System.in);
            System.out.println("From: ");
            int numFrom = src.nextInt();
            System.out.println("To: ");
            int numTo = src.nextInt();
            PrimeFromAToBFunction primeFromAToBFunction = new PrimeFromAToBFunction();
            primeFromAToBFunction.rangePrime(numFrom,numTo);
        }

}