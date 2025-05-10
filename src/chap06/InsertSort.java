package chap06;

public class InsertSort {

    static void insertSort(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // 삽입할 값
            int j = i - 1;

            // key보다 큰 값을 오른쪽으로 한 칸씩 밀기
            while (j>=0 && arr[i] > key){
                arr[j+1] = arr[j];
                j--;
            }

            // 삽입 위치에 key 저장
            arr[j+1] = key;
        }


    }


}
