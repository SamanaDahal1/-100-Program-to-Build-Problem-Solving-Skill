package Level1;

import java.util.Scanner;
//Write a program to read the radius of a circle and print its area and circumference.
public class CircleAreaPerimeter {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        System.out.println("Enter radius of a circle: ");
        double r = src.nextDouble();
        double perimeter=2*3.14*r;
        double area = 3.14*r*r;
        System.out.printf("Perimeter: %f\nArea: %f",perimeter,area);
    }
}
