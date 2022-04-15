/*
 * Class: QuickSortInt.JAVA
 * @Author Logan Kinnaird
 * @Version 1.3
 * Course ITEC 2150-07 Spring 2022
 * Written: Apr 10, 2022
 *
 * This class - Algorithm to order data something of a hybrid between a bubble sort and a binary search
 */

// @see https://www.javatpoint.com/quick-sort

import java.util.Arrays;

public class QuickSortInt
{
	public int partition(int[] list, int beginning, int end)
	{
		int pivot = list[end];
		int i = beginning - 1;

		for (int j = beginning; j < end - 1; j++)
		{
			if (list[i] <= pivot)
			{
				i++;
				int tempStorageVariable = list[i];
				list[i] = list[j];
				list[j] = tempStorageVariable;
			}
		}

		int tempStorageVariable = list[i + 1];
		list[i + 1] = list[end];
		list[end] = tempStorageVariable;
		return (i + 1);
	}

	public void quickSortInt(int[] list, int beginning, int end)
	{
		System.out.println(Arrays.toString(list) + '\n');
		if (beginning < end)
		{
			int partIndex = partition(list, beginning, end);
			quickSortInt(list, beginning, (partIndex - 1));
			quickSortInt(list, (partIndex + 1), end);
		}

	}
}

