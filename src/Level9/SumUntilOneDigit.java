package Level9;

import java.util.Scanner;

public class SumUntilOneDigit {
    void sumAll(int num) {
        while(num>=10){
            int sum=0;
            while (num > 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            num = sum;
        }
        System.out.println("Final Total: "+ num);
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        SumUntilOneDigit sumUntilOneDigit = new SumUntilOneDigit();
        sumUntilOneDigit.sumAll(num);

    }
}

