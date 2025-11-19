package ScenarioBasedQuestion;
import java.util.*;
public class PresentAbsent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int max=0,count=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(a==0){
                count++;
                if(count>max) max=count;
            }else{
                count=0;
            }
        }
        System.out.println(max);
    }
    
}
