package basic;

import java.util.Arrays;
import java.util.Scanner;

public class BOK1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        int max = Arrays.stream(numbers).max().getAsInt();

        double avg = (double) (sum * 100) / max / count;
        System.out.println(avg);


    }


}
