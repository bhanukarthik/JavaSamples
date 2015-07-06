import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CommonChild {

 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1,s2;
		s1=s.next();
		s2=s.next();
		s.close();
		int[][] x = new int[s1.length()+1][s2.length()+1];
		int mxsf=0;
		for(int i=1;i<=s1.length();i++)
		{
			for(int j=1;j<=s2.length();j++)
			{
				if(s1.charAt(i-1)==s2.charAt(j-1))
				{
					x[i][j]=x[i-1][j-1]+1;
					mxsf=mxsf>x[i][j]?mxsf:x[i][j];
				}
				else
				{
					x[i][j]=x[i][j-1]>x[i-1][j]?x[i][j-1]:x[i-1][j];
				}

			}

		}
		System.out.println(mxsf);

	}

}