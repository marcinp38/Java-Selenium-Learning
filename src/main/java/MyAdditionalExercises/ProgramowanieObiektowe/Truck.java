package MyAdditionalExercises.ProgramowanieObiektowe;

public class Truck implements Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("Jade Ciezarowka z predkoscia: "+speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje ciezarowka");
    }

    @Override
    public String info() {
        return "ciezarowka";
    }


}
