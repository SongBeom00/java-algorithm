package basic;

import java.util.Scanner;

public class BOK15829 {
    public static void main(String[] args) {
        final int MOD = 1234567891;
        final int R = 31;

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String str = sc.next();

        long sum = 0;
        long rPower = 1;

        for (int i = 0; i < num ; i++) {
            int asc = str.charAt(i) - 'a' + 1;
            sum = (sum + asc * rPower) % MOD;
            rPower = (rPower * R) % MOD;
        }

        System.out.println(sum);


    }

}
