package Classes;

import java.util.Scanner;

public class RecursiveMinimum {
    public static long getMinimum(){
        // get data inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount of numbers in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input the array of numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long startTime = System.nanoTime();
        System.out.println(smallest(0, arr));
        long finishTime = System.nanoTime();
        // returns method run time
        return finishTime-startTime;
    }

    private static int smallest(int index, int[] arr){
        // if check -> O(1) TC
        if (index == arr.length - 1){
            return arr[index];
        }
        // recursiveness happens 'n' times before it gets stopped by the previous if check
        int small = smallest(index + 1, arr);
        // if check -> O(1) TC
        return arr[index] < small ? arr[index] : small;

        // overall time complexity is O(n)
    }
}
