package Level4;

import java.util.Scanner;

public class FindFirstndLastDigitofNum {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = src.nextInt();
        int first = num%10;
        int last = 0;
        while(num>0){
            last=num%10;
            num= num/10;
        }
        System.out.println("Last: "+first);
        System.out.println("First: " + last);
    }
}
