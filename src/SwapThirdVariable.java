//Write a program to swap two numbers using a third variable.
public class SwapThirdVariable {
    public static void main(String[] args){
        int a = 4;
        System.out.printf("a(before swapping): %d\n",a);
        int b= 7;
        System.out.printf("b(before swapping): %d\n",b);
        int c =a;
        a=b;
        b=c;
        System.out.printf("a: %d\nb: %d",a,b);


    }
}
