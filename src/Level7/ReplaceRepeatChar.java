package Level7;

import java.util.Scanner;

public class ReplaceRepeatChar {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String words = src.nextLine();
        String a="";
        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            int count = 0;
            for (int j = 0; j < words.length(); j++) {
                if (ch == words.charAt(j)) {

                    count++;

                }
            }
            if (count != 1) {
                a = words.replace(ch, 'o');
            }

        }
        System.out.println(a);
    }
}