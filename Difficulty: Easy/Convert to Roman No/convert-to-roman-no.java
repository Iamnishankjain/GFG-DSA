//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			
			Solution ob = new Solution();
			System.out.println(ob.convertToRoman(N));
			t--;
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
	String convertToRoman(int num) {
		StringBuilder sb=new StringBuilder();
        int val[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String l[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};


        for(int i=val.length-1;i>=0;i--){
            while(num>=val[i]){
                sb.append(l[i]);
                num-=val[i];
            }
        }
        return sb.toString();
	}
}