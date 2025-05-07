package chap02;

import java.util.Scanner;

public class ArrayEqual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 a의 요솟수 :");
        int na = sc.nextInt();
        int[] a = new int[na];


        for (int i = 0; i < na; i++) {
            System.out.print("a["+ i +"] = " );
            a[i] = sc.nextInt();
        }

        System.out.println("배열 b의 요솟수 :");
        int nb = sc.nextInt();
        int[] b = new int[nb];

        for (int i = 0; i < nb; i++) {
            System.out.print("b["+ i +"] = " );
            b[i] = sc.nextInt();
        }


        System.out.println("배열 a와 b은 " + (equals(a,b) ? "같습니다." : "같지 않습니다."));

    }

    static boolean equals(int[] a, int [] b){
        if(a.length != b.length){ // 1. 배열의 길이가 다르면 false
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]){ // 2. 배열의 각 n번째의 숫자가 다르면 false
                return false;
            }
        }


        return true; // 1,2 의 조건이 둘 다 만족하지 않으면 같음
    }

}
