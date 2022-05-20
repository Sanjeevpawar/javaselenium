package Practice;

public class Loops {

    public static void main(String[] args) {

        // For loop
        for (int i = 1; i <= 20; i++) {
            int a = 20;
            int b = 30;
            int c = a + b;
            //System.out.println("Hello world");
            //System.out.println(i);
            System.out.println(c);
        }

        // Nested Loop
        for (int i = 1; i <= 3; i++) {
            //loop of j
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }//end of i
        }//end of j

        // PyramidExample
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();//new line

        }

        // While loop
        int i = 1;
        while (i <= 10) {
            System.out.println(i+ " Hello Sanj");
            i++;

        }

        int k=10;
        while (k>=1){
            System.out.println(k+" Helllo Bengaluru");
            k--;
        }


        }
    }



