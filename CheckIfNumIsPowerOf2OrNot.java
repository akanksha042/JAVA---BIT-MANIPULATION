import java.util.*;
public class CheckIfNumIsPowerOf2OrNot {
public static boolean check(int n){
return ((n&(n-1)) ==0);
}
    public static void main(String args[]){
System.out.println(check(21));
       
       
    }
    
}