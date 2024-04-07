package Classes;

import java.util.Scanner;

public class RecursiveDigitCheck {
    public static long checkStringForDigits(){
        // get input data
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String to check if it is digits only:");
        String s = sc.next();
        long startTime = System.nanoTime();
        System.out.println(isDigitsOnly(0, s) ? "Yes" : "No");
        long finishTime = System.nanoTime();
        // returns method run time
        return finishTime-startTime;
    }

    private static boolean isDigitsOnly(int index, String s){
        // if check -> O(1)
        if (index == s.length()){
            return true;
        }
        // if check -> O(1)
        if (!Character.isDigit(s.charAt(index))){
            return false;
        }
        // recursiveness happens 'n' times all the time
        return isDigitsOnly(index + 1, s);

        // overall time complexity is O(n).
    }
}
