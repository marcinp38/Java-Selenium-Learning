package MyAdditionalExercises.ProgramowanieObiektowe.Lambda;

public class StudentTest {

    public static void main(String[] args) {
//        tu tworzymy osobna klase ktora implementuje interfejs
        Student it = new ITStudent();
        sayHello("John", it,23);
//        tu uzywamy klasy anonimowej
        Student med = new Student() {
            @Override
            public void sayHello(String name,int age) {
                System.out.println("I will be a doctor");
                System.out.println("My name is " + name);
            }
        };
        sayHello("Kate", med,22);

//       lambda - (parametr) -> to co ma sie wykonac
//        np. (parametr) -> System.out.println("I am not a student, my name is " + name);
        Student noStudent = (name, age) -> {
            System.out.println("I am not a student, my name is " + name + " and I am " + age + " years old");
            if (age > 18) {
                System.out.println("I can buy an alcohol");
            }
        };
        sayHello("Tom",noStudent,19);





    }

    public static void sayHello(String name, Student student, int age) {
        student.sayHello(name,age);
    }
}
