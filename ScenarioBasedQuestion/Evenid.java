package ScenarioBasedQuestion;
import java.util.*;
public class Evenid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            int id=sc.nextInt();
            if(id%2==0){
                System.out.print(id+ " ");
                found=true;
            }
        }
        if(!found) System.out.print("-1");
    }
    
}
