package lambda;

public class LambdaInterfaceMain {

    public static void main(String[] args) {
        MathInterface math = new MathInterface() {
            @Override
            public double getPiValue() {
                return 3.141592;
            }
        };
        System.out.println("Pi : " + math.getPiValue());

        MathInterface math1 = () -> 3.141592;
        System.out.println("Pi : " + math1.getPiValue());


    }

}
