package array_hashmap;

//4. Write a program to find the position of a matched value from an array. If not matched, return -1 using function.
//Given array is: {10,5,2,3,2,7,7,15,10}
public class Program_4 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 2, 3, 2, 7, 7, 15, 10};
        System.out.println(checkIfExists(7, numbers));
    }

    public static int checkIfExists(int num, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                return i;
            }
        }
        return -1;
    }

}
