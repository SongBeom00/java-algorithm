package chap01;

public class Max3m {

    static int max3(int a, int b, int c){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        return max;
    }

    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        return max;
    }

    static int min3(int a, int b, int c){
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;


        return min;
    }

    static int min4(int a,int b, int c, int d){
        int min = min3(a,b,c);
        if(d < min) min = d;
        return min;
    }

    public static void main(String[] args) {
        System.out.println("max3(1,2,3) = " + max3(1, 2, 3));
        System.out.println("max3(5,6,9) = " + max3(5, 6, 9));
        System.out.println("max3(4,7,4) = " + max3(4, 7, 4));
        System.out.println("max4(5,2,6,9) = " + max4(5, 2, 6, 9));
        System.out.println("max4(1,4,2,4) = " + max4(1, 4, 2, 4));
        System.out.println("min3(2,1,5) = " + min3(2, 1, 5));

    }

}
