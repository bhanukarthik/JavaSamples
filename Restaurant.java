import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Restaurant {

    public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
			int T=scan.nextInt();
			for(int i=0;i<T;i++)
			{
				int l=scan.nextInt(),b=scan.nextInt();
				int min=l>b?b:l;
				System.out.println(check(min,l,b));
			}
	}

	private static int check(int max, int l, int b) {
		// TODO Auto-generated method stub
		int mx=0;
		for(int i=1;i<=max;i++)
		{
			if(l%i==0&&b%i==0&&(l*b)%(i*i)==0)
				mx=(l*b)/(i*i);
		}
		return mx;
	}

}