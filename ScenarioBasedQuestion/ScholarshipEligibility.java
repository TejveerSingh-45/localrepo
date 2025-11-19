package ScenarioBasedQuestion;
import java.util.*;
public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int eligible=0;
        for(int i=0;i<n;i++){
            int marks=sc.nextInt();
            int attendance=sc.nextInt();
            if(marks>=75 && attendance>=80){
                eligible++;
            }
        }
        System.out.println(eligible);
    }
    
}
