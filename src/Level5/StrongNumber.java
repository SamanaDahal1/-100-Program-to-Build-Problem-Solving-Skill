package Level5;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Entre your number: ");
        int num = src.nextInt();
        int og = num;
        int outerCount = 0;
        while (num > 0) {
            int innerCount = 1;
            int digit = num % 10;
            for(int i =1;i<=digit;i++){
                innerCount*=i;
            }
            outerCount+=innerCount;
            num = num / 10;

        }
        if(outerCount==og){
            System.out.println("Strong Number");
        }
        else {
            System.out.println("Not a Strong Number");
        }

    }
}
