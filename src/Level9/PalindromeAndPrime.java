package Level9;

import java.util.Scanner;

public class PalindromeAndPrime {
    void palindrome(int num){
        int store=0;
        int og = num;
        while (num>0){
            store=store * 10 + num % 10;
            num/=10;
        }
        if( og==store){
            System.out.println("Is Palindrome");
        }
        else {
            System.out.println("Isnt Palindrome");
        }

    }
    void prime(int num){
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

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = src.nextInt();
        PalindromeAndPrime palindromeAndPrime=new PalindromeAndPrime();
        palindromeAndPrime.palindrome(num);
        palindromeAndPrime.prime(num);
    }
}
