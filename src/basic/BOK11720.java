package basic;

import java.util.Scanner;

public class BOK11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int sum = 0;
        String number = sc.next();
        char[] charArray = number.toCharArray();
        for (int i = 0; i < number.length(); i++) {
            System.out.println("charArray = " + charArray[i]);
            sum += charArray[i] - '0';
        }

        System.out.println(sum);

    }

}
