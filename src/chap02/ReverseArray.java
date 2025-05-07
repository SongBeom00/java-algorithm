package chap02;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }

        reverse(x);

        System.out.println("요소를 역순으로 정렬했습니다.");
        for (int i = 0; i < num; i++) {
            System.out.println("x["+i+"] : " + x[i]);
        }

        int sum = sumOf(x);
        System.out.println("배열의 합은  = " + sum);

    }

    /**
     * 배열의 요소 a[idx1]과 a[idx2]의 값을 바꾼다
     * @param a
     * @param idx1
     * @param idx2
     */
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    /**
     * 배열 a의 요소를 역순으로 정렬
     * @param a
     */
    static void reverse(int[] a){
        for (int i = 0; i < a.length / 2; i++) {
            swap(a,i, a.length -i -1);
        }
    }


    static int sumOf(int[] a){
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        return sum;
    }



}
