package chap01;

public class Median {
    static int med3(int a,int b,int c){
        int sum = a+b+c;
        int max = Math.max(a,Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));

        return sum - max - min;

    }

    static int med(int a,int b,int c){
        if((a<=b && b <= c) || (b <= a && b<=c)){
            return b;
        }
        else if ((b<=a && a <= c)|| (c <= a && a <= b)){
            return a;
        }
        else {
            return c;
        }
    }


    public static void main(String[] args) {
        System.out.println("med3(1,5,4) = " + med3(1, 5, 4));
        System.out.println("med3(5,6,4) = " + med3(5, 6, 4));
    }




}
