package basic;

import java.util.*;

public class Solution_모의고사 {

    public int[] solution(int[] answers){
        int [] answer1 = {1, 2, 3, 4, 5};
        int [] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int [] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int score1 = 0, score2 = 0, score3 =  0;

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == answer1[i % answer1.length]){
                score1++;
            }
            if(answers[i] == answer2[i % answer2.length]){
                score2++;
            }
            if(answers[i] == answer3[i % answer3.length]){
                score3++;
            }
        }

        int maxScore = Math.max(score1,Math.max(score2,score3));

        List<Integer> result = new ArrayList<>();
        if(score1 == maxScore) result.add(1);
        if(score2 == maxScore) result.add(2);
        if(score3 == maxScore) result.add(3);

        return result.stream().mapToInt(Integer::intValue).toArray();

    }

    public static void main(String[] args) {

    }

}
