package Level7;

import java.util.Scanner;

public class ToggleStringCase {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String words = src.nextLine();
        String result="";
        for(int i =0; i <words.length();i++){
            char ch = words.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result+= (char) (ch - 32);

            }
            else if (ch >= 'A' && ch <= 'Z') {
                result+= (char) (ch + 32);
            }
            else {
                result+=ch;
            }
        }
        System.out.println("Toggle Word: " + result);

    }
}
