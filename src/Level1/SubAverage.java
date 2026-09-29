package Level1;

import java.util.Scanner;

public class SubAverage {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.print("Enter number of size:  ");
        int size= src.nextInt();
        double []array= new double[size];
        System.out.println("Enter Mark Subjects: ");
        for(int i = 0 ; i <size;i++){
            array[i]= src.nextDouble();
        }
        double sum =0;
        for (int i=0; i <size; i++){
            sum+=array[i];
        }
        System.out.println("Total Sum: "+ sum);
        double average= sum/size;
        System.out.println("Average: "+ average);

    }
}
