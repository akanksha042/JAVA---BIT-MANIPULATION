import java.util.*;
public class Set_ith_Bit {

    public static int setith(int n,int i){
        int bitmask = 1<<i;
        return (n | bitmask);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("enter the value of i : ");
       
        int i = sc.nextInt();
        System.out.println(setith(n,i));
        

    }
    
}
