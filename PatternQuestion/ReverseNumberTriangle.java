package PatternQuestion;

// public class ReverseNumberTriangle {
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=5;j>=i;j--){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
    
// }
import java.util.*;
class t{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+ " ");
            }
            for(int j=0;j<i*2-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}