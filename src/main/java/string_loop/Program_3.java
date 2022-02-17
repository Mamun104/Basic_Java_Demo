package string_loop;

import java.util.Scanner;

public class Program_3 {
    public static void main(String[] args) {
        System.out.println("Press enter to start your zikir: \nPress 0 and hit enter for quit");
        Scanner scanner=new Scanner(System.in);
        int count=0;
        while(true){
            String readLine=scanner.nextLine();
            count++;
            if(readLine.equals("0")){
                break;
            }
            System.out.print(count);
        }
    }
}
