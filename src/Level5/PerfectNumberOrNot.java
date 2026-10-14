package Level5;

import java.util.Scanner;

public class PerfectNumberOrNot {
    public static void main(String[] args) {
        int count = 0;
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        int og = num;
        for(int i =1 ;i<num;i++){
            if(num%i==0){
                count+=i;
            }
        }
        if(count==og){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not Prefect Number");
        }
    }
}
