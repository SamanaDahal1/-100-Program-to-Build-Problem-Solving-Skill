package Level9;

import java.util.Scanner;

public class IntoBinary {
    void intoBinary(int num){
        int store =0;
         while (num>0){
           int  reminder =num%2;
           num = num/2;
             store = store * 10 + reminder;
         }
         int binary =0;
         while (store>0){
         int lastDigit=store%10;
         store= store/10;
         binary=binary*10+lastDigit;
         }
         System.out.println("binary equivalent: "+ binary);
    }
    public static void main(String[] args) {
        IntoBinary intoBinary = new IntoBinary();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        intoBinary.intoBinary(num);

    }
}
