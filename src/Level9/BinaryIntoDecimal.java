package Level9;

import java.util.Scanner;

public class BinaryIntoDecimal {
    void intoDecimal(int num){
        int decimal =0;
        int power = 1;
        while(num>0){
            int last = num%10;
            if(last!=0 && last !=1){
                System.out.println("Binary Number only");
                return;
            }
            decimal = decimal+(last*power);
            power =power*2;
            num=num/10;
        }
        System.out.println("Decimal equivalent: " + decimal);
    }

    public static void main(String[] args) {
        BinaryIntoDecimal binaryIntoDecimal = new BinaryIntoDecimal();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int num = scanner.nextInt();
        binaryIntoDecimal.intoDecimal(num);

    }
}
