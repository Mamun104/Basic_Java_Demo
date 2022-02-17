package basic;

import java.util.Scanner;

//Write a program to solve (a+b)^2 by taking input a and b from the user
public class Program_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input the value of a: ");
        int a=scanner.nextInt();
        System.out.println("Input the value of b: ");
        int b=scanner.nextInt();
        double res=Math.pow(a,2)+2*a*b+Math.pow(b,2);

        System.out.println((int)res);
    }
}
