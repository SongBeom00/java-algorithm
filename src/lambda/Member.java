package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Member {
    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("윈터",23));
        members.add(new Member("카리나",24));
        members.add(new Member("닝닝",22));

        System.out.println(members);

        // 정렬을 익명 클래스로 구현
        Collections.sort(members,new Comparator<Member>(){

            @Override
            public int compare(Member o1, Member o2) {
                return o2.age - o1.age;
            }
        });
        System.out.println(members);

        // 정렬을 람다 표현식으로 구현
        members.sort(((o1, o2) -> o2.age - o1.age));

        System.out.println(members);


    }





}
