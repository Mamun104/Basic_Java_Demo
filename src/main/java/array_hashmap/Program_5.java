package array_hashmap;

//5. Create a hashmap that will store 2, 5, 10, 20, 50, 100, 200, 500, 1000 tk note and each time generate 3 notes randomly and show their summation.

import java.util.HashMap;
import java.util.Random;

public class Program_5 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> notes=new HashMap<Integer,Integer>();
        notes.put(0,2);
        notes.put(1,5);
        notes.put(2,10);
        notes.put(3,20);
        notes.put(4,50);
        notes.put(5,100);
        notes.put(6,200);
        notes.put(7,500);
        notes.put(8,1000);

        Random random=new Random();
        int key1= random.nextInt(10);
        int key2= random.nextInt(10);
        int key3= random.nextInt(10);

        int note1=notes.get(key1);
        int note2=notes.get(key2);
        int note3=notes.get(key3);

        System.out.println(note1+" Tk");
        System.out.println(note2+" Tk");
        System.out.println(note3+" Tk");
        int summation=note1+note2+note3;
        System.out.println("Sum of 3 notes are: "+summation+" Tk");
    }
}
