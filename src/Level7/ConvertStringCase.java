package Level7;

import java.util.Scanner;

public class ConvertStringCase {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String words = src.nextLine();
        String upper="";
        String lower = "";
        for(int i =0; i <words.length();i++){
        char ch = words.charAt(i);
        if (ch >= 'a' && ch <= 'z') {
            upper += (char) (ch - 32);

        }
        else {
            upper += ch;
        }
        if (ch >= 'A' && ch <= 'Z') {
             lower += (char) (ch + 32);
        }
        else {
            lower+= ch;
        }
        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
