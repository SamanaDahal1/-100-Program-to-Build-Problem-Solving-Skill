package Level7;

import java.util.Scanner;

public class NumberOfVowelAndConsonants {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Type anything: ");
        String a = src.nextLine();
        int countVowel = 0;
        int countCons = 0;
        a=a.replace(" ","");
        a=a.toLowerCase();
        int size = a.length();
        for(int i =0 ; i<size;i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                countVowel++;
            }
            else {
                countCons++;
            }
        }
        System.out.println("Vowel: "+ countVowel +" Consonants: "+countCons);

    }
}
