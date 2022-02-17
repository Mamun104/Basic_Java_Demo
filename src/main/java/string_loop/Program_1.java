package string_loop;

import java.util.Scanner;
//1. Write a program to sum of digits of a number by taking from user input

public class Program_1 {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int sum=0;
        while(number!=0){
            int rem=number%10;
            number=number/10;
            sum+=rem;

        }
        System.out.println(sum);
    }
}
