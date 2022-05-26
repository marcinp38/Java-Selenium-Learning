package MyAdditionalExercises.ProgramowanieObiektowe;

public class MethodsTest {
    public static void main(String[] args) {
        Methods methods = new Methods();
//        methods.countNumbers();
//        int result = methods.countResult();
//        int result2 = result*2;
//        System.out.println("rezultat przed mnozeniem to :"+result);
//        System.out.println("rezultat po mnozeniu to :"+result2);
        methods.countNumbers(15);
        methods.countNumbers(150);

        System.out.println();

        int result = methods.add(234,4234, "hello");
        System.out.println(result);

    }
}
