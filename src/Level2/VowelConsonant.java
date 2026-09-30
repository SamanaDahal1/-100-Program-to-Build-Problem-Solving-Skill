package Level2;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char cha = src.next().charAt(0);
        if(cha == 'a' || cha =='e'||cha == 'i' || cha=='o' || cha=='u' ){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
