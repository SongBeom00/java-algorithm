package basic;

import java.util.Scanner;

public class BOK11659 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suNo = sc.nextInt();
        int quizNo = sc.nextInt();

        int[] arrays = new int[suNo+1];
        for (int i = 1; i <= suNo; i++) {
            int value = sc.nextInt();
            arrays[i] = arrays[i - 1] + value;
        }

        for (int i = 0; i < quizNo; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println((arrays[end] - arrays[start-1]));
        }

    }


}
