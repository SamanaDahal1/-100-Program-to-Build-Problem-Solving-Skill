package Level7;

import java.util.Scanner;

public class ReplaceRepeatChar {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String words = src.nextLine();
        System.out.print("Enter character you want to replace: ");
        char oldChar = src.next().charAt(0);
        System.out.print("Enter new character: ");
        char newChar = src.next().charAt(0);
        String a = "";
        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            if (ch == oldChar) {
                a += newChar;
            }
            else {
                a += ch;
            }
        }
        System.out.println(a);
    }
}