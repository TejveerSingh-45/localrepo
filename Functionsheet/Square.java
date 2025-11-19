package Functionsheet;

public class Square {
    static void printsquare(int x,int y){
        for(int i=x;i<=y;i++){
            System.out.println("square of="+ i +" is " + (i*i));
        }
    }
    public static void main(String[] args) {
        int x=3;
        int y=8;
        printsquare(x, y);
    }
    
}
