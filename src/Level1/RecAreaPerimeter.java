package Level1;

import java.util.Scanner;
//Write a program to read the length and breadth of a rectangle and print its area and perimeter.
public class RecAreaPerimeter {
    public static void main(String[] args){
        Scanner src =new Scanner(System.in);
        System.out.print("Enter length: ");
        float length = src.nextFloat();
        System.out.print("Enter breadth: ");
        float breadth = src.nextFloat();
        float perimeter = 2*(length+breadth);
        float area = length*breadth;
        System.out.printf("Perimeter of rectange: %.2f\nArea of rectangle: %.2f",perimeter,area);
    }
}
