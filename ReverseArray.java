package chap02;

public class ReverseArray 
{
	static void reverseArray(int numArr[])
	{
		for(int i=0; i<numArr.length/2; i++)
		{
			swapArr(numArr,i,numArr.length-1-i);
		}
	}
	
	static void swapArr(int numArr[], int source, int target)
	{
//		int a = numArr[source];
//		int b = numArr[target];
//		int temp = a;
//		a = b;
//		b = temp;
		
		int temp = numArr[source];
		numArr[source] = numArr[target];
		numArr[target] = temp;
	}
	
	static void displayArray(int numArr[])
	{
		for(int i=0; i<numArr.length; i++)
		{
			System.out.println(numArr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		int numArr[] = {0,1,2,3,4};
		
		reverseArray(numArr);
		
		displayArray(numArr);
	}
}
