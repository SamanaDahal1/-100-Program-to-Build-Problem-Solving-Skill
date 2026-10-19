package Level7;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Type anything: ");
        String a = src.nextLine();
        int count = 0;
        try {
            while (true){
                a=a.replace(" ","");
                a.charAt(count);
                count++;


            }
        } catch (StringIndexOutOfBoundsException e) {

        }
        System.out.print(count);


    }
}
