import java.util.Scanner;

import java.util.*;
public class Get_ith_Bit {


    public static int getit(int n, int i){
       
       int bitmask = 1<<i;
        if((n & bitmask) ==0){
            return 0;
        }
        else {
            return 1;
        }

    }
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n here : ");
        int n = sc.nextInt();
        System.out.print("enter the value of i here : ");
        int i = sc.nextInt();
        System.out.println(getit(n,i));
        // getit(n,i);
       

       
        
    }
    
}
