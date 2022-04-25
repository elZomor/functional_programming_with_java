package com.company.firstClassFunctions;

public class IX_Recursion {

    public static void main(String[] args) {
        countToCounterRecursion(0,10);
        System.out.println();
        countToCounterForLoop(0, 10);
        System.out.println();
        System.out.println(factorial(5));

        int count = 10;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2);
        fibonacci(count - 2, n1, n2);
    }

    public static void countToCounterRecursion(int start, int counter) {
        if (start > counter) return;
        System.out.print(start + " ");
        countToCounterRecursion(start + 1, counter);
    }

    public static void countToCounterForLoop(int start, int counter) {
        for (int i = start; i <= counter; i++) {
            System.out.print(i + " ");
        }
    }

    public static int factorial(int x) {
        if (x == 1) return 1;
        return x * factorial(x - 1);
    }
    // 0 1 1 2 3 5 8 13
    public static void fibonacci(int count, int n1, int n2) {
        if (count > 0) {
            System.out.print(" " + (n1 + n2));
            fibonacci(count - 1, n2, n1+n2);
        }
    }
}
