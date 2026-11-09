package Level9;

import java.util.Scanner;

public class MenuExist {
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
        Scanner src = new Scanner(System.in);
        MenuExist menuExist = new MenuExist();
        while (true){
        System.out.println("-----Menu-----\n" +
                "1.Decimal to Binary\n" +
                "2. Binary to Decimal\n" +
                "3. Exit");
        System.out.print("Enter your choose: ");
        int choice = src.nextInt();
        if(choice==1){
            System.out.print("Enter decimal number: ");
            int num = src.nextInt();
            menuExist.intoBinary(num);
        }
        else if (choice==2) {
            System.out.print("Enter Binary number: ");
            int num = src.nextInt();
            menuExist.intoDecimal(num);
        }
        else if (choice==3) {
            System.exit(0);
        }
        else {
            System.out.println("Please enter valid number(1-3)");
        }
        }

    }
}
