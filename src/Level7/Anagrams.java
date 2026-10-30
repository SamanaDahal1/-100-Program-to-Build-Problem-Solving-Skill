package Level7;

import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a first word: ");
        String firstWords = src.nextLine();
        System.out.print("Enter a second word: ");
        String secondWord = src.nextLine();
        if (firstWords.length() != secondWord.length()) {
            System.out.println("Non Anagram");
            return;
        }
        for (int i = 0; i < firstWords.length(); i++) {
            char check = firstWords.charAt(i);
            int countOne = 0;
            int countTwo = 0;
            for (int j = 0; j < firstWords.length(); j++) {
                if (check == firstWords.charAt(j)) {
                    countOne++;
                }
            }
            for (int j = 0; j < secondWord.length(); j++) {
                if (check == secondWord.charAt(j)) {
                    countTwo++;
                }
            }
            if (countOne!=countTwo){
                System.out.println("Non Anagram");
                return;
            }
        }
        System.out.println("Anagarm");

        }
    }
