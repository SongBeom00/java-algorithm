package chap03;

import java.util.Arrays;
import java.util.Scanner;

// 이진 검색 Arrays.binarySearch 사용
public class BinarySearchTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.print("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");
        arr[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x["+i+"] : ");
                arr[i] = sc.nextInt();
            }while (arr[i] < arr[i-1]);
        }

        System.out.print("검색할 값 : ");
        int key = sc.nextInt();

        int idx = Arrays.binarySearch(arr, key);

        if(idx < 0){
            System.out.println("그 값은 요소에 없습니다.");
        }
        else{
            System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
        }


    }


}
