package Level3;

import java.util.Scanner;

public class OddNumberUptoUserInput {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter you number: ");
        int num = src.nextInt();
        System.out.println("Odd numbers:");
        for(int i = 1;i<num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

    }
}
