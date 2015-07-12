import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StockMax {

   static boolean[] buy,sell;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		for(int l=0;l<t;l++)
		{
		int s=scan.nextInt();
		long[] a=new long[s];
		for(int i=0;i<s;i++)
			a[i]=scan.nextLong();
		sell=new boolean[s];
		
		if(reverse(a)||equal(a)||a.length<=1)
		{
			System.out.println("0");
			continue;
			
		}
		gen(a);
		System.out.println(profit(a));
		}
	}
	
	private static void gen(long[] a) {
		long max=a[a.length-1];
		if(a[a.length-1]>a[a.length-2])
			sell[a.length-1]=true;
		for(int i=a.length-2;i>=0;i--)
		{
			if(a[i]>=max)
			{
				sell[i]=true;
				max=a[i];
				
			}
			else
			{
				sell[i]=false;
			}
		}
		// TODO Auto-generated method stub
		
	}


	private static boolean reverse(long[] a) {
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				return false;
			}
		}
		return true;
		// TODO Auto-generated method stub
		
	}
	private static boolean equal(long[] a) {
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				return false;
			}
		}
		return true;
		// TODO Auto-generated method stub
		
	}

	
	private static long profit(long[] a) {
		// TODO Auto-generated method stub
		long b=0,bought=0,profit=0;
		for(int i=0;i<a.length;i++)
		{
		 if(!sell[i])
		 {
			 bought+=a[i];
			 b++;
		 }	
		 else
		 {
			profit+=a[i]*b-bought;
			bought=0;
			b=0;
		 }
		
		}
		return profit;
		
	}

}