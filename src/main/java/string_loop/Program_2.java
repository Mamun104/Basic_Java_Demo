package string_loop;

import java.util.Scanner;

//Write a program to show range of prime numbers from 2 to n using while loop [n is the number by user input]
public class Program_2 {
    public static void main(String[] args) {
        System.out.println("Input a number as a range to see prime numbers: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        int j=2;
        while(j<=n){
            boolean flag=true;
            for(int i=2;i<=j/2;i++){
                if(j%i==0){
                    flag=false;
                    break;
                }
            }

            if(flag==true){
                System.out.println(j);
                count++;
            }
            j++;
        }
        System.out.println("Total prime numbers from 2 to "+n+" is "+count);
    }
}
