package array_hashmap;
import java.util.Arrays;
import java.util.Scanner;

//2. Find the second largest number from an array by user input using function
public class Program_2 {
    public static void main(String[] args) {
        int size=10;
        int[] numbers=new int[size];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<size;i++){
            numbers[i]=scanner.nextInt();
        }
        Arrays.sort(numbers);
        int secondLargestNumber=numbers[numbers.length-2];
        System.out.println(secondLargestNumber);
    }
}
