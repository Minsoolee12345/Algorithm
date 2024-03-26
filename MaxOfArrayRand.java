package chap02;

import java.util.Random;
import java.util.Scanner;
public class MaxOfArrayRand 
{
	
	static int getpositiveNumber(String message)
	{	
		Scanner in = new Scanner(System.in);
		
		int num;
		
		do{
			System.out.print(message);
			num=in.nextInt();
		}while(num <= 0);
		
		return num;
	}
	
	
	static void getRandArray(int num[],int start, int end)
	{
		Random rand = new Random();
		
		for(int i=0; i<num.length; i++)
		{
			num[i] = start + rand.nextInt(end-start);
			System.out.println(num[i]+"cm");
		}
		
	}
	
	
	static int maxOf(int n[])
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
		Scanner in = new Scanner(System.in);
		int num = getpositiveNumber("사람 수 : ");
		
		int height[] = new int[num];
		getRandArray(height, 100, 200);
		
		int max = maxOf(height);
		
		System.out.println("가장 큰 키는 " + max + "cm입니다.");
		
		
	}
}
