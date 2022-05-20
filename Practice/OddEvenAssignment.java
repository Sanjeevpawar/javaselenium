package Practice;

import java.util.Scanner;

public class OddEvenAssignment {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int j =sc.nextInt();

        if(j%2==1){
            System.out.println(j+" Is Odd number");
    }else System.out.println(j+" Is even number");
}
}

