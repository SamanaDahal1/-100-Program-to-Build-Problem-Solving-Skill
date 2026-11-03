package Level8;

public class SumEvenOddIndex {
    public static void main(String[] args) {
        int[] list1 = {1,2,3,4,5,6};
        int evenSum=0;
        int oddSum=0;
        System.out.println("Elements of first array");
        for(int list : list1){
            System.out.print(list +" ");
        }
        for (int i =0 ;i< list1.length;i++){
            if(i%2==0){
                evenSum+=list1[i];
            }
            else {
                oddSum+=list1[i];
            }
        }
        System.out.println("\nEven Index Sum: " + evenSum);
        System.out.println("Odd Index Sum: " + oddSum);

    }
}
