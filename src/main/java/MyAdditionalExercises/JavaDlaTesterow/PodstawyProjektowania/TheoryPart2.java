package MyAdditionalExercises.JavaDlaTesterow.PodstawyProjektowania;

public class TheoryPart2 {
    public static void main(String[] args) {

//    Operatory porównania - porownuja elementy rownania i zwracaja wartosc logiczna (true/false)

        int firstNumber = 5;
        int secondNumber = 10;
        boolean result;

        System.out.println(firstNumber > secondNumber);     //wieksze od
        System.out.println(firstNumber < secondNumber);     //mniejsze od
        System.out.println(firstNumber >= secondNumber);    //wieksze rowne od
        System.out.println(firstNumber <= secondNumber);    //mniejsze rowne od
        System.out.println(firstNumber == secondNumber);    //rowne sobie
        System.out.println(firstNumber != secondNumber);    //rozne od siebie
        System.out.println();

//    Operatory logiczne - dzialaja na wartosciach logicznych i zwracaja wartosc logiczna

        System.out.println("Operatory logiczne:");
        boolean firstValue = 2>1;
        boolean secondValue = 2<1;
        boolean thirdValue = false;
        boolean fourthValue = true;

        System.out.println(firstValue && secondValue);      // &&-operator "and"
        System.out.println(firstValue && thirdValue);       //zeby bylo true oba musza byc true

        System.out.println(firstValue || secondValue);      // ||-operator "or"
        System.out.println(firstValue || fourthValue);      // zeby bylo true jeden z elementow musi byc true

        System.out.println(!firstValue);                    // !-operator "not" - zaprzeczenie wyjsciowego
        System.out.println(!secondValue);                   // rezultaty logicznego
        System.out.println(!(firstValue&&secondValue));

    }
}
