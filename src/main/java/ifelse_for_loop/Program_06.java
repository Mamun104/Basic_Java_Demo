package ifelse_for_loop;

import java.util.Scanner;

//Write a program to print prime numbers from 2 to n
public class Program_06 {
    public static void main(String[] args) {
        System.out.println("Input a number as a range to see prime numbers: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int count=0;
        for(int j=2;j<n;j++){
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
        }
        System.out.println("Total prime numbers from 2 to "+n+" is "+count);

    }
}
