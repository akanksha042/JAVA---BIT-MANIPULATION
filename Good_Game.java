import java.util.*;
public class Good_Game {
    public static void main (String[] args) 
	{
		// your code goes here
		
		 Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n+x>6){
                System.out.println("YES");
            
            
        }
        else{
            System.out.println("NO");
        }
		
	}
}
    
}
