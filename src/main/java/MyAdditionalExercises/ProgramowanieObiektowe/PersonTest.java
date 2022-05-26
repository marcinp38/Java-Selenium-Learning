package MyAdditionalExercises.ProgramowanieObiektowe;

public class PersonTest {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Tom", 48,"University of Technology");
        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMath();
        System.out.println();

        Footballer footballer = new Footballer("Donny",25, "Everton");
        footballer.walk();
        footballer.eat();
        footballer.playFootball();


    }
}
