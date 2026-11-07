package Level9;

import java.util.Scanner;

public class CountPrimeInaDigit {
    void countPrime(int a) {
        int primeCount = 0;
        while (a > 0) {
            int digit = a % 10;
            int count = 0;

            for (int j = 1; j <= digit; j++) {
                if (digit % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                primeCount++;
            }

            a=a/ 10;
        }

        System.out.println("Total num of prime digits: " + primeCount);
    }


    public static void main(String[] args) {
    CountPrimeInaDigit countPrimeInaDigit= new CountPrimeInaDigit();
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = src.nextInt();
    countPrimeInaDigit.countPrime(num);

    }
}
