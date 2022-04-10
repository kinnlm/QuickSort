/*
 * Class: QuickSort002.JAVA
 * @Author Logan Kinnaird
 * @Version
 * Course ITEC 2150-07 Spring 2022
 * Written: Apr 10, 2022
 *
 * This class - Algorithim to order data something of a hybrid between a bubble sort and a binary sort
 */

public class QuickSort002
{
	public int counter = 0;
	int partition(int[] list, int beginning, int end)
	{
		int pivot = list[end];
		int i = beginning - 1;

		for (int j = beginning; j <= end; j++)
		{
			if (list[i] < pivot)
			{
				i++;
				int storageVariable = list[i];
				list[i] = list[j];
				list[j] = storageVariable;
			}
		}

		int storageVariable = list[i + 1];
		list[i + 1] = list[end];
		list[end] = storageVariable;
		return (i + 1);
	}

	void quickSort002(int[] list, int beginning, int end)
	{   ++counter;
		if (beginning < end)
		{
			int partIndex = partition(list, beginning, end);
			quickSort002(list, beginning, partIndex - 1);
			quickSort002(list, partIndex + 1, end);
		}
	}
}

