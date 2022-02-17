package basic;

import java.util.Scanner;

//Write a program to take 3 inputs from user and do sum and average
public class Program_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input number 1: ");
        double a= scanner.nextDouble();
        System.out.println("Input number 2: ");
        double b= scanner.nextDouble();
        System.out.println("Input number 3: ");
        double c= scanner.nextDouble();

        double sum=a+b+c;
        double avg=sum/3;

        System.out.println("Sum is "+sum);
        System.out.println("Average is "+avg);

    }
}
