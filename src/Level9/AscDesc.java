
package Level9;

import java.util.Scanner;

public class AscDesc {

    void asc(int num) {
        int[] list = new int[String.valueOf(num).length()];
        for (int i = 0; i < list.length; i++) {
            list[i] = num % 10;
            num /= 10;
        }
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        long smallest = 0;
        for (int i = 0; i < list.length; i++) {
            smallest = smallest * 10 + list[i];
        }
        System.out.println("Smallest number: " + smallest);
    }

    void desc(int num) {
        int[] list = new int[String.valueOf(num).length()];
        for (int i = 0; i < list.length; i++) {
            list[i] = num % 10;
            num /= 10;
        }
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] < list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        long largest = 0;
        for (int i = 0; i < list.length; i++) {
            largest = largest * 10 + list[i];
        }
        System.out.println("Largest number: " + largest);
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = src.nextInt();
        AscDesc ascDesc = new AscDesc();
        ascDesc.asc(num);
        ascDesc.desc(num);
    }
}
