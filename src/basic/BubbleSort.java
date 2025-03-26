package basic;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int [] arr1 = new int[count];
        for (int i = 0; i < count; i++) {
            int value = sc.nextInt();
            arr1[i] = value;
        }
        int[] arr2 = bubbleSorted(arr1);
        for (int i1 : arr2) {
            System.out.println(i1);
        }

    }

    private static int[] bubbleSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
