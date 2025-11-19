package ScenarioBasedQuestion;
import java.util.*;
public class MaxMinSale {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sale=sc.nextInt();
            if(sale>max) max=sale;
            if(sale<min) min=sale;
        }
        System.out.println(max+ " "+min);
    }
    
}
