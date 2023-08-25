/*
Input:
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by above
block of height 4 is 3 units and above
block of height 0 is 7 units. So, the
total unit of water trapped is 10 units.

 */


import java.util.Scanner;
public class Main {
    static int Rani_Water_Storage(int[] array){
        if (array.length <= 1) return 0;
        int result = 0;
        int start = 0;
        int end = array.length - 1;
        int left_max = 0;
        int right_max = 0;
        while (start <= end){
            if (array[start] <= array[end]){
                if (array[start] <= left_max){
                    result += left_max - array[start];
                }else left_max = array[start];
                start++;
            }else {
                if (array[end] <= right_max){
                    result += right_max - array[end];
                }else left_max = array[end];
                end--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Enter the number you want search in array ");
        System.out.println(Rani_Water_Storage(array));
    }
}