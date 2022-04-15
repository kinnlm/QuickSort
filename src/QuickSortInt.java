/*
 * Class: QuickSortInt.JAVA
 * @Author Logan Kinnaird
 * @Version 1.3
 * Course ITEC 2150-07 Spring 2022
 * Written: Apr 10, 2022
 *
 * This class - Algorithm to order data something of a hybrid between a bubble sort and a binary sort
 */

// @see https://www.javatpoint.com/quick-sort

public class QuickSortInt
{
/**
 * @param counter count how many steps it takes to order data
 */
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
				int tempStorageVariable = list[i];
				list[i] = list[j];
				list[j] = tempStorageVariable;
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

