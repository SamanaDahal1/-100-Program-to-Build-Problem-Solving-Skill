package Level4;

import java.util.Scanner;

public class LargestDigitInaNumber {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter more than 1 digit number: ");
        int num = src.nextInt();
        int max=num%10;
        while(num>0){
            if(num%10>max)
                max= num%10;
            num= num/10;
        }
        System.out.println(max);

    }
}
