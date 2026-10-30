package Level7;

import java.util.Scanner;

public class CountFrequencyOfChar {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String words = src.nextLine();

        for(int i =0; i <words.length();i++) {
            char ch = words.charAt(i);
            int count = 0;
            boolean already = false;
            for (int a = 0;a<i;a++){
                if(ch==words.charAt(a)){
                    already=true;
                    break;
                }
            }
            if(already){
                continue;
            }
            for (int j=0;j<words.length();j++){
                if(ch==words.charAt(j)){

                    count++;

                }
            }
            System.out.println(words.charAt(i) +"="+ count);
        }


    }
}
