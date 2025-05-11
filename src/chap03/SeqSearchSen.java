package chap03;

import java.util.Scanner;

// 보초법(Sentinel method)
public class SeqSearchSen {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num+1]; // 요솟수의 num + 1

        for (int i = 0; i < num; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값  : "); // 키 값을 입력
        int key = sc.nextInt();

        int idx = seqSearchSen(x,num,key);


        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }
        else {
            System.out.println(key + "는 x["+idx+"] 에 있습니다.");
        }

    }

    private static int seqSearchSen(int[] x, int num, int key) {
        int i  = 0;
        x[num] = key; // 보초를 추가

        while (true){
            if(x[i] == key){
                break;
            }
            i++;
        }

        return i == num? -1 : i;
    }

}
