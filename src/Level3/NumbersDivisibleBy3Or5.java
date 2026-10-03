package Level3;

import java.util.Scanner;

public class NumbersDivisibleBy3Or5 {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        for(int i=1; i<=num; i++){
            if(i%3==0 || i%5==0){
                System.out.println(i);
            }
        }
    }
}
