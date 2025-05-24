package chap03;

// 아이디를 부여하는 클래스
public class Id {

    private static int counter = 0;
    private int Id;

    public Id() {
        Id = ++counter;
    }

    public int getId() {
        return Id;
    }

    public static int getCounter() {
        return counter;
    }

}


