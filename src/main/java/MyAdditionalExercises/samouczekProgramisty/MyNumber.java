package MyAdditionalExercises.samouczekProgramisty;

public class MyNumber {
    double value;

    public MyNumber(double value){
        this.value = value;
    }

    public boolean isOdd(){
        return value%2!=0;
    }

    public boolean isEven(){
        return ! isOdd();
    }
    public double sqrt(){
        return Math.sqrt(value);
    }

    public MyNumber pow(){
        return new MyNumber(Math.pow(value, pow().value));
    }



}
