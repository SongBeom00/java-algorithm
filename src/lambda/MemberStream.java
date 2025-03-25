package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MemberStream {
    String name;
    int age;

    public MemberStream(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("카리나",24));
        members.add(new Member("윈터",23));
        members.add(new Member("지젤",24));
        members.add(new Member("닝닝",22));

        // 스트림 API를 사용하지 않은 예전 방식
        List<String> chosenMembers = new ArrayList<>();
        // 나이가 24세인 멤버의 이름을 chosenMembers 리스트에 삽입
        for (Member member : members){
            if(member.age == 24){
                chosenMembers.add(member.name);
            }
        }

        // chosenMembers 정렬
        Collections.sort(chosenMembers);

        // chosenMembers 출력
        for (String name : chosenMembers) {
            System.out.println("name = " + name);
        }
        System.out.println("===============================");

        /* ========================== 스트림 API ==================================== */
        // 스트림 API 사용 방식
        members.stream() // 스트림 API
                .filter(m -> m.age == 24) // 24세 필터링
                .map(m -> m.name) // 이름 매핑
                .sorted() // 정렬
                .collect(Collectors.toList()) // 리스트로 취합(아래 출력 시 생략 가능)
                .forEach(System.out::println); // 메소드 참조로 출력

        System.out.println("===============================");

        List<Double> numbers = Arrays.asList(49.1,25.5,9.9);

        //람다 표현식
        numbers.stream()
                .map(n -> Math.round(n)) // 반올림 처리
                .forEach(n -> System.out.println(n)); //순회 하여 출력


        System.out.println("===============================");

        // 메소드 참조
        numbers.stream()
                .map(Math::round)
                .forEach(System.out::println);

    }



}
