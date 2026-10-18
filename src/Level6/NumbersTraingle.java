package Level6;

import java.util.Scanner;

public class NumbersTraingle {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter height: ");
        int num = src.nextInt();
        for(int i =1 ; i<=num ; i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
