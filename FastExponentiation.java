
public class FastExponentiation {
public static int check(int a, int n){
int ans =1;
while(n>0){
if((n & 1) != 0){//check lsb is 1 or not
ans =ans * a;
}
a = a * a;
n = n>>1;
}
return ans;
}


    public static void main(String args[]){
System.out.println(check(3,5));
System.out.println(check(5,3));
System.out.println(check(3,3));
System.out.println(check(2,5));
       
       
    }


/*
dry run karte hai
a^n = 5^3
ans =1     a = 5  n = 011 
1> ans  = 1*5 =5
a =25
n =001
2> ans = 5 * 25 =125
a= (25)^2 = 625
n = 000
loops terminate
loop run kiya 2 times
normally run karta 3 times
so we were successfully able to minimize the time complexity
Current Time Complexity : O(log n)
try modulo exponentiation
*/
    
}