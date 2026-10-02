package Level3;

import java.util.Scanner;

public class NaturalNumberReverse {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter you number: ");
        int num = src.nextInt();
        for(int i =num;i>=1;i-- ){
            System.out.print(i + "\n");
        }
    }

}
