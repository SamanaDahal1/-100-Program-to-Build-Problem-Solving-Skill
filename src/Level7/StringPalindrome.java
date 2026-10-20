package Level7;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Type anything: ");
        String a = src.nextLine();
        String reverse = "";
        for(int i= a.length()-1;i>=0;i--){
            reverse= reverse+a.charAt(i);
        }
        if(reverse.equals(a)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
