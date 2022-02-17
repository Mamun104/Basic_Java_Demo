package ifelse_for_loop;

import java.util.Scanner;

//Take a number as input from the user. Now write a program to show table of the given numbers

public class Program_05 {
    public static void main(String[] args) {
        System.out.println("Input a number to see the table");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for(int i=1;i<=10;i++){
            int mul=number*i;
            System.out.println(number+"*"+i+"="+mul);
        }
    }
}
