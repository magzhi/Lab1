package Classes;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static long getFibonacci(){
        // get data input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input which number of fibonacci series that you want to get:");
        int n = sc.nextInt();
        long startTime = System.nanoTime();
        System.out.println(fibonacci(2, 0, 1, n));
        long finishTime = System.nanoTime();
        // return method run time
        return finishTime-startTime;
    }

    public static int fibonacci (int index, int f0, int f1, int n){
        // if check -> O(1) TC
        // recursiveness happens 'n' times before it gets stopped by the previous if check
        return (index == n) ? f0 + f1 : fibonacci(index + 1, f1, f0 + f1, n);

        // overall time complexity is O(n).
    }
}
