package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

    //신체 검사 데이터를 정의
    static class PhyscData{
        private String name; // 이름
        private int height; // 키
        private double vision; // 시력

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        // 오름차순으로 정렬하기 위한 comparator
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();


        private static class HeightOrderComparator implements Comparator<PhyscData>{

            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height >  d2.height) ? 1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("이나령",162,0.3),
                new PhyscData("유지훈",168,0.5),
                new PhyscData("김한결",169,0.3),
                new PhyscData("홍준기",171,1.2),
                new PhyscData("전서현",173,0.5),
                new PhyscData("이호연",174,0.8),
                new PhyscData("이수민",175,1.3),
        };

        System.out.printf("몇 cm인 사람을 찾고 있나요? : ");
        int height = sc.nextInt();

        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
        if(idx < 0){
            System.out.println("그 값은 요소에 없습니다.");
        }
        else{
            System.out.println("x["+idx+"]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]); // 자동으로 toString 메서드 호출
        }

    }




}
