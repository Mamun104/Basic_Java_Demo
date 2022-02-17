package ifelse_for_loop;

import java.util.Scanner;

//Write a program that takes a year from user and print whether that year is a leap
//year or not

public class Program_01 {
    public static void main(String[] args) {
        System.out.println("Please enter an year to check if it is leapyear or not");
        Scanner scanner =new Scanner(System.in);
        int year=scanner.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("This is a Leapyear");
                }
                else{
                    System.out.println("This is not leapyear");
                }
            }
            else{
                System.out.println("This is a leapyear");
            }
        }
        else{
            System.out.println("This is not Leapyear");
        }
    }
}
