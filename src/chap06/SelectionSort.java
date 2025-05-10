package chap06;

import java.util.Arrays;

public class SelectionSort {

    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void selectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            // 가장 작은 인덱스 값을 찾는다.
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            swap(arr,minIdx,i);
        }
        
    }

    public static void main(String[] args) {
        int a[] = {2,10,6,5,9,3};
        selectionSort(a);
        for (int i : a) {
            System.out.println("i = " + i);
        }
    }



}
