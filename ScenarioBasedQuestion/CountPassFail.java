package ScenarioBasedQuestion;
import java.util.*;
public class CountPassFail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pass=0,fail=0;
        for(int i=0;i<n;i++){
            int mark=sc.nextInt();
            if(mark>=35) pass++;
            else fail++;
        }
        System.out.println(pass+" "+fail);
    }
}
