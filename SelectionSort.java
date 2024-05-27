package mysort.sort;

public class SelectionSort extends Sort 
{
	
	@Override
	public void sort(int[] dataList) 
	{
		setData(dataList);
		
		// 배열을 끝에서부터 시작해서 가장 큰 값을 선택하여 오름차순으로 정렬
		for (int last = sortedData.length-1; last >= 1; last--) 
		{
			int maxIndex = selectMax(sortedData, last);
			if (maxIndex != last)
				swap(sortedData, maxIndex, last);
		}
	}
	
	int selectMax(int[] dataList, int last)
	{
		int max = dataList[0];
		int maxIndex = 0;
		
		
		// 배열에서 가장 큰 값을 찾음
		for (int i = 1 ; i <= last; i++) 
		{
			if (dataList[i] > max) 
			{
				max = dataList[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	
}
