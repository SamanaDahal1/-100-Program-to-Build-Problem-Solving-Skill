package Level6;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a Base Number: ");
        int baseNum = src.nextInt();
        System.out.println("Enter a Power Number: ");
        int powerNum = src.nextInt();
        int result = 1;
        for(int i = 1;i<=powerNum;i++){
            result *=baseNum;

        }
        System.out.println(result);
    }
}
