package Classes;

import java.util.Scanner;

public class PrimeDetector {
    public static long checkPrime(){
        // collects input data
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number to check if it is a prime or a composite:");
        int n = sc.nextInt();
        long startTime = System.nanoTime();
        System.out.println(isPrime(n) ? "Prime" : "Composite");
        long finishTime = System.nanoTime();
        // returns run time of the method
        return finishTime - startTime;
    }

    private static boolean isPrime (int n){
        // for loop runs square root of 'n' at the most in the worst case
        for (int i = 2; i < Math.sqrt(n); i++) {
            // if check -> O(1) TC
            if (n == (n / i) * i){
                return false;
            }
        }
        return true;

        // overall method runs at O(square root of 'n') time complexity.
    }
}
