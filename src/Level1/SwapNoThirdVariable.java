package Level1;

//Write a program to swap two numbers without using a third variable.
public class SwapNoThirdVariable {
    public static void main(String[] args){
        int a= 2;
        System.out.println("Before swapping a: "+a);
        int b= 8;
        System.out.println("Before swapping b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.printf("After swaping\na: %d\nb: %d",a,b);

    }
}
