package MyAdditionalExercises.ProgramowanieObiektowe;

public class Methods {
    public int countResult() {
        System.out.println("Zaraz policze wynik");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result += i;

        }
        return result;
    }

    public void countNumbers(int number) {
        System.out.println("Zaraz policze wynik");
        System.out.println("Number ma wartosc: " + number);
        int result = 0;
        for (int i = 0; i < number; i++) {
            result += i;

        }
        System.out.println("Rezultat to: " + result);
    }

    public int add(int firstNumber, int secondNumber, String text) {
        System.out.print("suma to: ");
        if (firstNumber == 0) {
            return 0;
        }
        System.out.print(text);
        return firstNumber + secondNumber;
    }
}
