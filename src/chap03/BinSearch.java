package chap03;


import java.util.Scanner;

// 이진 검색 (Binary Search)
// -> 반드시 정렬(sort)이 된 상태에서 검색을 해야 한다.
public class BinSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.print("오름차순으로 입력하세요 : ");

        System.out.print("arr[0] : ");
        arr[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("arr["+i+"] : ");
                arr[i] = sc.nextInt();
            }while (arr[i] < arr[i-1]); // 바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 값");
        int key = sc.nextInt();

        int idx = binSearch(arr,num,key);

        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }
        else {
            System.out.println(key + "는 x["+idx+"] 에 있습니다.");
        }


    }

    private static int binSearch(int[] arr, int num, int key) {
        int pl = 0; // 검색 범위의 첫 인덱스
        int pr = num - 1; // 검색 범위의 끝 인덱스

        do{
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
            if(arr[pc] == key){
                return pc; // 검색 성공
            } else if (arr[pc] < key) {
                pl = pc + 1;
            }
            else {
                pr = pc - 1;
            }
        }while (pl <= pr);

        return -1;
    }


}
