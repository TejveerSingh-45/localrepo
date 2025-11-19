package ScenarioBasedQuestion;
import java.util.*;
public class perfectpair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []deadline=new int[n];
        for(int i=0;i<n;i++){
            deadline[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(deadline[i]+deadline[j]==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
