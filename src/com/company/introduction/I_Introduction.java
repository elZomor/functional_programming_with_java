package com.company.introduction;

public class I_Introduction {
    public static void main(String[] args) {
        int[] arr = {1 , 3 , 2 , 4 , 5, 1};
        // To get the average of an array //
        // Using imperative
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = (float) sum / arr.length;
        System.out.println("Imperative paradigm result: " + avg);

        // Using declarative
        float avg2 = (float) getArraySum(arr, 0) / arr.length;
        System.out.println("Declarative paradigm result: " + avg2);
    }

    public static int getArraySum (int[] arr, int i) {
        return i == arr.length
            ? 0
            : arr[i] + getArraySum(arr, i + 1);
    }
}
