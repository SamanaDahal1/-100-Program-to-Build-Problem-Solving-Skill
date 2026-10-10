package Level5;

import java.util.Scanner;

public class PrimeNumberFrom1toN {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = src.nextInt();


        for (int i = 1; i <= num; i++) {
            int count =0;
            for (int j =1 ; j<=i ; j++){
                if(i % j== 0) {
                    count++;

                }

                }
            if(count==2){
                System.out.println(i);
            }


                }


            }
        }


