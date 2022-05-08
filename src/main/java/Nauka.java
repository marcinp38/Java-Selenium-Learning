public class Nauka {
    public static void main(String[] args) {
        przedszkole uczen = new przedszkole("lapanego ", "zwierzatka ", "dodawanie");
        System.out.println(uczen.wf + uczen.angielski + uczen.matematyka);

        podstawowka starszak = new podstawowka();
        starszak.wf = "zbijak";
        starszak.angielski = "gramatyka";
        starszak.matematyka = "mnozenie";
        starszak.przyroda = "budowa czlowieka";
        starszak.fizyka = "zasady dynamiki Newtona";
        System.out.println(starszak.wf+ " " + starszak.fizyka);

        liceum nastolatek = new liceum();
        nastolatek.wf = "pilka nozna";
        nastolatek.fizyka = "skomplikowane zagadnienia fizyczne";
        nastolatek.informatyka = "programowanie";
        System.out.println(nastolatek.wf+ " "+ nastolatek.fizyka+ " "+ nastolatek.informatyka);
    }
}
class przedszkole {
    String wf;
    String angielski;
    String matematyka;
    public przedszkole() {
    }
    public przedszkole (String wf, String angielski, String matematyka) {
        this.wf = wf;
        this.angielski = angielski;
        this.matematyka = matematyka;
    }
}
class podstawowka extends przedszkole {
    String przyroda;
    String fizyka;
}
class liceum extends podstawowka {
    String informatyka;
}
