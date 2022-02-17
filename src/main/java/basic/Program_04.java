package basic;

import java.util.Scanner;

//Write a program to generate random numbers from minimum range to maximum range by user input
public class Program_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input min range: ");
        int min=scanner.nextInt();
        System.out.println("Input max range: ");
        int max=scanner.nextInt();

        double random_number=Math.random()*(max-min)+min;
        System.out.println((int) random_number);

    }
}
