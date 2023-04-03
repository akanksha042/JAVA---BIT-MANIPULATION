import java.util.*;
public class Island_of_aliens {
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int temp,r,s=0;
		    temp=n;
		    while(n>0)
		    {
		      r = n%10;
		      s = 10*s+r;
		      n = n/10;
		    }
		    if(temp == s)
		    System.out.println("wins");
		    else 
		    System.out.println("loses");
		}
	}
    
}

