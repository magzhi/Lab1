package Classes;

import java.util.Scanner;

public class AverageOfRecursiveSum {
    public static long getAverage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount of numbers in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Input the array of numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long startTime = System.nanoTime();
        System.out.println(((float) sum(0, arr)) / (float) n);
        long finishTime = System.nanoTime();
        return finishTime-startTime;
    }

    private static int sum (int index, int[] arr){
        // if check -> O(1) TC
        // recursiveness happens 'n' times all the time
        return (index == arr.length - 1) ? arr[index] : sum(index + 1, arr) + arr[index];

        // overall method runs at O(square root of 'n') time complexity.
    }
}
