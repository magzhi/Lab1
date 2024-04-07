package Classes;

import java.util.Scanner;

public class RecursiveBinomialCoefficient {
    public static long getBinomial(){
        // collect input data
        Scanner sc = new Scanner(System.in);
        System.out.println("Input numeral 'n' for binomial coefficient");
        int n = sc.nextInt();
        System.out.println("Input numeral 'k' for binomial coefficient");
        int k = sc.nextInt();
        long startTime = System.nanoTime();
        System.out.println(binomial(n, k));
        long finishTime = System.nanoTime();
        // return method run time
        return finishTime-startTime;
    }

    private static int binomial (int n, int k){
        // if check -> O(1) TC
        // for each return in the worst case it doubles the recursiveness
        return (k == 0 || n == k) ? 1 : binomial(n-1,k-1) + binomial(n-1,k);

        // overall time complexity is 2^O(n), as it is exponential.
    }
}
