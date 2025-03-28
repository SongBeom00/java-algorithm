package basic;

import java.util.Arrays;
import java.util.Scanner;

public class BOK25305 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();
        int cutLine = sc.nextInt();
        int[] arr = new int[capacity];
        for (int i = 0; i <= capacity-1; i++) {
            int value = sc.nextInt();
            arr[i] = value;
        }
        Arrays.sort(arr);
        System.out.println(arr[capacity-cutLine]);

    }
}
