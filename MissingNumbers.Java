import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MissingNumbers {

   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int s1=s.nextInt(),s2;
		Set<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> l = new ArrayList<Integer>();
		int A[]=new int[s1],B[],temp[]=new int[10000],temp1[]=new int[10000];
		for(int i=0;i<s1;i++)
		{	
			A[i]=s.nextInt();
			temp[A[i]]+=1;
		}
		s2=s.nextInt();
		B= new int[s2];
		for(int j=0;j<s2;j++){
			B[j]=s.nextInt();
			set.add(B[j]);
			temp1[B[j]]+=1;
		}
		for(int j: set){
			if(temp1[j]>temp[j])
			{
					l.add(j);
			}
		}
		Collections.sort(l);
		for(int i: l)
			System.out.print(i+" ");
	}
}