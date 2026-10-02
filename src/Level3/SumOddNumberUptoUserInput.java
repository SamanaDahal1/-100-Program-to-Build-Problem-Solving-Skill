package Level3;

import java.util.Scanner;

public class SumOddNumberUptoUserInput {
        public static void main(String[] args){
            Scanner src = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = src.nextInt();
            int count=0;
            for(int i =1;i<=num;i++){
                if(i%2!=0){
                    count+=i;
                }

            }
            System.out.printf("Sum of all odd number upto %d is %d ",num,count);
        }
    }

