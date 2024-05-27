package mysort.sort;

public class InsertionSort extends Sort 
{

	@Override
	public void sort(int[] dataList) 
	{
		setData(dataList);
		
		// 배열의 두 번째 요소부터 시작
		for (int i = 1; i < sortedData.length; i++)
		{
			// 현재 요소를 뒤 요소들과 비교하여 삽입할 위치 찾기
			int loc = findLessFromLast(sortedData, sortedData[i], i-1);
			
			// 삽입할 위치가 현재 위치가 다를 때 요소를 삽입  
			if (loc != i-1)
				insertData(sortedData, loc+1, i);
		}

	}

	private void insertData(int[] dataList, int target, int source) 
	{
		int temp = dataList[source];
		
		// 삽입할 위치부터 현재위치까지 한칸식 오른쪽으로 이동
		for (int i = source; i > target; i--) 
		{
			dataList[i] = dataList[i-1];
		}
		
		// 삽입할 위치에 요소를 삽입
		dataList[target] = temp;
	}

	private int findLessFromLast(int[] dataList, int data, int last)
	{
		// 뒤에서부터 시작해서 특정 값보다 작거나 같은 값을 찾음 
		for (int i = last; i >= 0; i--) 
		{
			if (dataList[i] <= data) return i; 
		}
		return -1;
	}
	
	 

}
