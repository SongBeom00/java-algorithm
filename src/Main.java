import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < num; i++) {
            int value = sc.nextInt();
            set.add(value);
        }

        for (Integer i : set) {
            System.out.println(i);
        }


    }





}

