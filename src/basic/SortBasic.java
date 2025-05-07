package basic;

import java.util.Arrays;
import java.util.HashSet;

public class SortBasic {

    public static int[] solution(int[] numbers) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numbers.length -1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                hashSet.add(numbers[i] + numbers[j]);
            }
        }

        return hashSet.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] result = solution(new int[]{2,1,3,4,1});
        for (int i1 : result) {
            System.out.println(i1);
        }
    }
}
