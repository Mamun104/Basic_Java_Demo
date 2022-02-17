package array_hashmap;

import java.util.Scanner;

//6. Write a program that will show minimum number of currency notes to sum of given amount.
public class Program_6 {
    public static void main(String[] args) {
        int[] notes={1000,500,200,100,50,20,10,5,2};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input amount: ");
        int amount=scanner.nextInt();
        int noteCounter;
        for(int i=0;i<notes.length;i++){
            noteCounter= amount/notes[i];
            amount=amount%notes[i];
            if(noteCounter==0){
                continue;
            }
            System.out.println(notes[i]+" "+noteCounter);
        }
    }
}
