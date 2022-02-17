package basic;

import java.util.Scanner;

//Write a program to convert double type value to an integer type value
public class Program_02 {
    public static void main(String[] args) {
        System.out.println("Input a double type number: ");
        Scanner scanner=new Scanner(System.in);
        double num= scanner.nextDouble();
        System.out.println("Converted to Int type: "+(int) num);
    }
}
