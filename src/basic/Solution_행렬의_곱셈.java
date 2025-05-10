package basic;

public class Solution_행렬의_곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row1 = arr1.length;
        int col1 = arr1[1].length;
        int row2 = arr2.length;
        int col2 = arr2[1].length;

        int[][] answer = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }

        }

        return answer;
    }


    public static void main(String[] args) {
    }
}
