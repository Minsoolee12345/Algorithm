package chap02;

import java.util.Random;

public class MaxOfArray 
{
	static int  maxOf(int n[])
	{
		int max=n[0];
		
		for(int i=1; i<n.length; i++)
		{
			if(max<n[i])
			{
				max = n[i];
			}
		}
		
		return max;
		
	}
	
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n[] = {32,45,67,30,64};
		
		int max = maxOf(n);
		
		System.out.println("최대값은 "+max+"입니다.");
	}
}
