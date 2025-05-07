package chap02;

import java.util.Scanner;

public class MaxOfArray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int count = sc.nextInt();

        int[] height = new int[count];

        for (int i = 0; i < height.length; i++) {
            int input = sc.nextInt();
            height[i] = input;
            System.out.println("height["+ i +"] = " + height[i]);
        }

        System.out.println("최댓값은 " + maxOf(height) + "입니다.");

    }


    static int maxOf(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

}
