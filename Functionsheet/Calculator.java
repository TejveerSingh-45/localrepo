package Functionsheet;
public class Calculator {
    static int add(int a,int b){
        return a+b;
    }
    static int subtract(int a, int b){
        return a-b;
    }   
    static int multiply(int a,int b){
        return a*b;
    }
    static int divide(int a,int b){
        return a/b;
    }
    public static void main(String[] args){
        int x=12;
        int y=23;
        System.out.println("add:" +add(x,y));
        System.out.println("subtract:"+subtract(x,y));
        System.out.println("multiply:"+multiply(x,y));
        System.out.println("divide:"+divide(x,y));
    }
}
