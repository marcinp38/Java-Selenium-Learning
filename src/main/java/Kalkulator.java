

public class Kalkulator {
    public static void main(String[] args) {
        System.out.println(add(2, 5));
        System.out.println(substract(10, 2));
        System.out.println(multiply(2,5));
        System.out.println(divide(10, 2));

    }
    private static int add(int a, int b) {
        return a + b;
    }
    private static int substract(int i, int j) {
        return i - j;
    }
    private static int multiply(int b, int c) {
        return b * c;
    }
    private static int divide(int k, int l) {
        return k / l;
    }
    }
