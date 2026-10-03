package Level3;

import java.util.Scanner;

public class MultiplicationOfUserInputUptoUserInput {
        public static void main(String[] args){
            Scanner src = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = src.nextInt();
            System.out.print("Enter upto number: ");
            int upto = src.nextInt();
            for(int i = 1;i<=upto;i++){
                int store =num*i;
                System.out.println(num + "* "+i +"= "+ store);
            }
        }
    }

