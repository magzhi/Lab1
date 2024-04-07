package Classes;

import java.util.Scanner;

public class RecursiveReverse {
    public static long getInverse(){
        Scanner sc = new Scanner(System.in);
        // collects input
        System.out.println("Input the length of the array:");
        int n = sc.nextInt();
        System.out.println("Input ALL the numbers in the array:");
        long startTime = System.nanoTime();
        inverseOutput(1, n, sc);
        long finishTime = System.nanoTime();
        // returns timed interval of the method
        return finishTime-startTime;
    }

    private static void inverseOutput (int index, int n, Scanner sc){
        // nextInt -> O(1) TC
        int temp = sc.nextInt();
        // if check -> O(1) TC
        if (index < n){
            // recursive happens 'n' times
            inverseOutput(index + 1, n, sc);
        }
        // sout -> O(1) TC
        System.out.print(temp + " ");

        // one run of the method is O(1) TC, but it is run 'n' times
        // due to recursiveness, thus overall TC is O(n).
    }
}
