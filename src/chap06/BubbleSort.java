package chap06;

public class BubbleSort {

    static void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void bubbleSort(int arr[]){
        int n = arr.length;
        boolean swapped;

        // n - 1 번 반복
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // 인접한 두 항 비교 후 스왑
            for (int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    swapped = true;
                }
            }

            // 만약 정렬이 완료 되었으면 루프 종료
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] a = {2,5,1,8,4};
        bubbleSort(a);
        for (int i : a) {
            System.out.println("i = " + i);
        }
    }

}
