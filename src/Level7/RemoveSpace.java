package Level7;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String words = src.nextLine();
        String replaced="";
        for(int i =0; i <words.length();i++){
            replaced=words.replace(" ","");
        }
        System.out.println(replaced);
    }
}
