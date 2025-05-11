package chap03;

import java.util.Scanner;

// 선형 검색 (Linear Search)
public class SeqSearch {

    static int seqSearch(int[] arr, int n, int key){

        for (int i = 0; i < n; i++) {
            if(arr[i] == key){
                return i; // 찾으면 인덱스 반환 -> 검색 성공
            }
        }
        return -1; // 못 찾으면 -1 반환 -> 검색 실패
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = sc.nextInt();

        int[] n = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x["+i+"]");
            n[i] = sc.nextInt();

        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();
        int idx = seqSearch(n,num,key);


        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }
        else {
            System.out.println(key + "는 x["+idx+"] 에 있습니다.");
        }


    }




}
