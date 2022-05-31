package MyAdditionalExercises.ProgramowanieObiektowe.Lambda;

public class ITStudent implements Student{
    @Override
    public void sayHello(String name,int age) {
        System.out.println("I am IT guy");
        System.out.println("My name is " + name);
    }


}
