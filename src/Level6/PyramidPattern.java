package Level6;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter number of rows: " );
        int num = src.nextInt();
        for(int i =1 ; i<=num ; i++){
            for (int j = 1;j<=(num-i);j++){
                System.out.print(" ");
            }
            for(int a = 1;a<=i;a++){
                System.out.print("*"+" ");
            }

            System.out.println();
            }
        }
    }

