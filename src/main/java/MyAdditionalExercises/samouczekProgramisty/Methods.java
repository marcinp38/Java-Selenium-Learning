package MyAdditionalExercises.samouczekProgramisty;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println(getMyAge());
        System.out.println(getMyName());
        MathEquations(7,4);
        System.out.println(isEven(8));
        System.out.println(thirdPow(5));
        System.out.println(sqrt(125));
        System.out.println(isSquare(3,5,7));
    }

private static int getMyAge(){
    return 30;
}
private static String getMyName(){
        return "Marcin";
}
private static void MathEquations(int a, int b){
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
}
private static Boolean isEven(float num){
    return num%2 ==0;
    }
private static Boolean isDivided(float num){
        return num%3==0 && num%5==0;
}
private static double thirdPow(double number){
        return Math.pow(number, 3);
}
private static double sqrt(double a){
        return Math.sqrt(a);
}
private static boolean isSquare(float a, float b, float c) {
    if (a < 0 || b < 0 || c < 0) {
        return false;
    }
    double longest = a;
    double side1 = b;
    double side2 = c;

    if (b > a && b > c) {
        longest = b;
        side1 = a;
        side2 = c;
    } else if (c > a && c > b) {
        longest = c;
        side1 = a;
        side2 = b;

    }
    return side1*side1+side2*side2==longest*longest;

}

}
