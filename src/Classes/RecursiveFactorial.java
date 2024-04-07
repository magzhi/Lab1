package Classes;

import java.util.Scanner;

public class RecursiveFactorial {
    public static long getFactorial(){
        // gets data input
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number to get a factorial of it:");
        int n = sc.nextInt();
        long startTime = System.nanoTime();
        System.out.println(factorial(1, n));
        long finishTime = System.nanoTime();
        // returns method run time
        return finishTime-startTime;
    }

    private static int factorial (int index, int n){
        // if check -> O(1) TC
        if (index == n){
            return index;
        }
        // recursiveness happens 'n' times before it gets stopped by the previous if check.
        return factorial(index + 1, n) * index;

        // overall time complexity is O(n).
    }
}
