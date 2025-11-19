package ScenarioBasedQuestion;
import java.util.*;
public class ReverseDivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        int []ids=new int[n];
        for(int i=0;i<n;i++){
            ids[i]=sc.nextInt();
        }
        boolean found=false;
        for(int i=n-1;i>=0;i--){
            if(ids[i]%5==0){
                System.out.print(ids[i]+ " ");
                found=true;
            }
        }
        if(!found) System.out.print("-1");
        
    }
    
}
