package Level2;

import java.util.Scanner;

public class AlphabetDigitSpecial {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character to check whether it is Alphabet or digit or symbol: ");
        char a = s.next().charAt(0);
        if(a>='A' && a<='Z' || a>='a' && a<='z' ){
            System.out.println("Alphabet");
        }
        else if (a>='0' && a<='9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Symbol");
        }


    }
}
