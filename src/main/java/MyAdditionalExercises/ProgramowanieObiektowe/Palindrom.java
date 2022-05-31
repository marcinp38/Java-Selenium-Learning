package MyAdditionalExercises.ProgramowanieObiektowe;


// palindrom - czytany od konca do poczatku daje taki sam efekt jak przy czytaniu od poczatku do konca np. kajak
public class Palindrom {

    public static void main(String[] args) {
        System.out.println(isPallindrom("rabarbar"));
    }
    public static boolean isPallindrom(String word) {
        word = word.toLowerCase();
        int n = word.length();

        for (int i = 0; i < (n / 2); i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
