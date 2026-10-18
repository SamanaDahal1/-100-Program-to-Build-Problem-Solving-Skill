package Level6;

import java.util.Scanner;

public class InvertRightAngled {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter height: ");
        int num = src.nextInt();
        for(int i =num ; i>0; i--){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

