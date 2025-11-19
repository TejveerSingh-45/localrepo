package ScenarioBasedQuestion;
import java.util.*;
public class StockPriceIncrease {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]price=new int[n];
        for(int i=0;i<n;i++){
            price[i]=sc.nextInt();
        }

        int count=0;
        for(int i=1;i<n;i++){
            if(price[i]>price[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
    
