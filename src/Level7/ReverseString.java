package Level7;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Type anything: ");
        String a = src.nextLine();
        for(int i= a.length()-1;i>=0;i--){
          System.out.print(a.charAt(i));
        }

    }
}
