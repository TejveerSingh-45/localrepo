package ScenarioBasedQuestion;
import java.util.*;
public class AboveAverage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]temp=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            temp[i]=sc.nextInt();
            sum+=temp[i];
        }
        int count=0;
        double avg=(double)sum/n;
        for(int i=0;i<n;i++){
            if(temp[i]>avg) count++;
        }
        System.out.println(count);
    }
    
}
