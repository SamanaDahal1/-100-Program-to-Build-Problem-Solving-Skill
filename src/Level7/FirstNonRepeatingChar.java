package Level7;

import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String words = src.nextLine();
        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            int count = 0;
            for (int a = 0; a < words.length(); a++) {
                if (ch == words.charAt(a)) {
                    count++;
                }
            }

        if (count == 1) {
                System.out.println(words.charAt(i));
                return;
            }
        }
    }
}
