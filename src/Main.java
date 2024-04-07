import Classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Enter Application Number that you want to run:
                 1: Find Minimum From Array
                 2: Get Average From Array
                 3: Check if Number is a Prime
                 4: Get Factorial
                 5: Find n-th Fibonacci.
                 6: Get Power of a number.
                 7: Reverse Input Array.
                 8: Check if String Contains Digits Only.
                 9: Get Binomial Coefficient.
                 10: GCD Calculator""");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n" + appSwitch(sc.nextInt()) + " ns");
    }

    public static long appSwitch(int n){
        return switch (n) {
            case 1 -> RecursiveMinimum.getMinimum();
            case 2 -> AverageOfRecursiveSum.getAverage();
            case 3 -> PrimeDetector.checkPrime();
            case 4 -> RecursiveFactorial.getFactorial();
            case 5 -> RecursiveFibonacci.getFibonacci();
            case 6 -> RecursivePower.getPower();
            case 7 -> RecursiveReverse.getInverse();
            case 8 -> RecursiveDigitCheck.checkStringForDigits();
            case 9 -> RecursiveBinomialCoefficient.getBinomial();
            case 10 -> RecursiveEuclideanAlgorithm.getGCD();
            default -> 0;
        };
    }
}