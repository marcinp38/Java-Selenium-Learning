package MyAdditionalExercises.ProgramowanieObiektowe;

public class Bike implements Vehicle{
    @Override
    public void jazda(int speed) {
        System.out.println("Jedziem, jedziem! Gonie juz " + speed + " km/h");
    }

    @Override
    public void stop() {
        System.out.println("STOP! Ostro hamulcuje");
    }

    @Override
    public String info() {
        return "rower";
    }

    public void zatankuj() {
        System.out.println("Aby miec duzo sily musze zjesc obiad");
    }
}
