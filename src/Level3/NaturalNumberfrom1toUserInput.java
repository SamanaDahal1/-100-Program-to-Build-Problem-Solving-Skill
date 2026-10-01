package Level3;

import java.util.Scanner;

public class NaturalNumberfrom1toUserInput {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number upto where you want to print natural number: ");
        int num = src.nextInt();
        for(int i = 1 ;i<=num ; i++){
            System.out.println(i);
        }
    }
}
