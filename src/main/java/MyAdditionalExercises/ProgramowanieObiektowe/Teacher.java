package MyAdditionalExercises.ProgramowanieObiektowe;

public class Teacher extends PersonDziedziczenie{

    public String school;

    public Teacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze Teacher");
        this.school = school;
    }

    public void teachMath() {

        System.out.println("I'm teaching math on " + school);
    }

    public void sayHello() {

        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + age + " years old");
    }

}
