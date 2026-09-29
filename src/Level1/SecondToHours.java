package Level1;

import java.util.Scanner;

public class SecondToHours {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter Seconds: ");
        int sec = src.nextInt();
        int hours= sec/(60*60);
        int min = sec%(60*60)/60;
        int s = sec%60;
        System.out.println(hours+"hours " +min+"mins "+s+"secs");

    }
}
