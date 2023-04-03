import java.util.*;
public class OddOrEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int bitmask = 1;
        if((n & bitmask) == 1){
            System.out.println("its odd");
        }
        else {
            System.out.println("its even");
        }
       
    }
    
}


