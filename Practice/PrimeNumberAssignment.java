package Practice;

import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PrimeNumberAssignment {



    public static void main(String[] args) {

        String st = "PHP Exercises and Python Exercises";
        System.out.println(st.contains("and"));

//        Prime number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();

        if (n % 2 == 1) {
            System.out.println(n + " Is Prime number");
        } else System.out.println("Not a prime number");
    }
}

