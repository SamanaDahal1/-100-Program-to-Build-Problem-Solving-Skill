package Level3;

import java.util.Scanner;

public class CountNumbersDivisibleBy3 {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        int count=0;
        for(int i =1;i<=num;i++) {
            if (i % 3 == 0) {
                count ++;
            }
        }
        System.out.println(count);
    }
}


