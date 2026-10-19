package Level7;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfWordInSentence {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Type anything: ");
        String a = src.nextLine();
        String[] b = a.split(" ");
        System.out.println(b.length);

    }
}

