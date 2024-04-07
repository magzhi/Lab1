package Classes;

import java.util.Scanner;

public class RecursivePower {
    public static long getPower(){
        // get data inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the numeral 'a':");
        int a = sc.nextInt();
        System.out.println("Input the power of said numeral 'n'");
        int n = sc.nextInt();
        long startTime = System.nanoTime();
        System.out.println(power(0, a, n));
        long finishTime = System.nanoTime();
        // return method run time
        return finishTime-startTime;
    }

    private static int power(int index, int a, int n){
        // if check -> O(1) TC
        if (index == n - 1){
            return a;
        }
        // recursiveness happens 'n' times before it gets stopped by the previous if check
        return power(index + 1, a, n) * a;

        // overall time complexity is O(n)
    }
}
