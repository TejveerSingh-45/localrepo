package Functionsheet;
import java.util.*;
public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        double volume=(4.0/3)*Math.PI*R*R*R;
        System.out.println(volume);
    }
    
}
