package Level3;

import java.util.Scanner;

public class EvenNumberUptoUserInput {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = src.nextInt();
        System.out.println("Even Numbers: ");
        for(int i = 1; i<=num ; i++){
            if(i%2==0){
                System.out.println(i );
            }
        }

    }
}
