package array_hashmap;
// 3. Write a program to show the duplicates values . Given array is: {10,5,2,3,2,7,7,15,10}
//Output: 2, 7, 10
public class Program_3 {
    public static void main(String[] args) {
        int[] numbers={10,5,2,3,2,7,7,15,10};
        findDuplicates(numbers);
    }
    public static void findDuplicates(int[] num){
        for(int i=0;i<num.length;i++){
            for(int j=0;j<i;j++){
                if(num[i]==num[j]){
                    System.out.println(num[i]);
                }
            }
        }
    }
}
