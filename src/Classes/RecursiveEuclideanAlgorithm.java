package Classes;

import java.util.Scanner;

public class RecursiveEuclideanAlgorithm {
    public static long getGCD(){
        // gets data inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number of GCD:");
        int a = sc.nextInt();
        System.out.println("Input the second number of GCD:");
        int b = sc.nextInt();
        long startTime = System.nanoTime();
        System.out.println(gcd(a, b));
        long finishTime = System.nanoTime();
        // returns method run time
        return finishTime-startTime;
    }

    private static int gcd (int a, int b){
        // if check -> O(1) TC
        // worst case it calls recursive function logarithmic amount of smallest number,
        // as the new value of 'b' will be equal to at most 'a/2' so it rapidly decreases the problem
        // until 'b' reaches 0
        return b == 0 ? a : gcd(b, a % b);

        // overall time complexity is O(log(n)).
    }
}
