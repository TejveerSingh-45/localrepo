package Functionsheet;
public class Pythagoras {
    static double hypotenuse(double a, double b){
        return Math.sqrt(a*a+b*b);
    }
    public static void main(String[] args) {
        double a=4;
        double b=3;
        double c=hypotenuse(a, b);
        System.out.println("hypotenuse " +c);
    }
}
