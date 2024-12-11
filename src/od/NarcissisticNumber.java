package od;

import java.util.Scanner;

public class NarcissisticNumber {
    // 打表解决
    public static void main(String[] args) {
        System.out.println("Hi");
        for (int i = 1000000; i <= 9999999; i++) {
            if (isNarcissistic(i, 7))
                System.out.print(i+" ");
        }
    }

    private static boolean isNarcissistic(int number, int n) {
        int sum = 0;
        int original = number;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, n);
            number /= 10;
        }
        return sum == original;
    }
}
