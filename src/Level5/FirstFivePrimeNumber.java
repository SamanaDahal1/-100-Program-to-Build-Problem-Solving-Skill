package Level5;

public class FirstFivePrimeNumber {
        public static void main(String[] args) {
            int a = 0;
            for (int i = 1; a< 5; i++) {
                int count =0;
                for (int j =1 ; j<=i ; j++) {
                    if (i % j == 0) {
                        count++;

                    }

                }

                if(count==2 ){
                        System.out.println(i);
                        a++;
                }
                }
                }

            }


