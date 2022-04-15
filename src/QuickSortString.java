/*
 * Class: QuickSortString.JAVA
 * @Author Logan Kinnaird
 * @Version 1.5
 * Course ITEC 2150-07 Spring 2022
 * Written: Apr 10, 2022
 *
 * This class - Quick sort for strings
 */

import java.util.Arrays;

/*
@see https://www.javatpoint.com/quick-sort
*/
public class QuickSortString
{
	/**
	 */
	public int counter = 0;

	public int partition(String[] list, int beginning, int end)
	{
		String pivot = list[end];
		int i = (beginning - 1);

		for (int j = beginning; j < end - 1; j++)
		{
//			System.out.println(list[i].compareTo(pivot));
			if (list[i].compareTo(pivot) <= 0)
			{
				i++;
				String tempStorageVariable = list[i];
				list[i] = list[j];
				list[j] = tempStorageVariable;
			}
			System.out.println(Arrays.toString(list));
		}

		String tempStorageVariable = list[i + 1];
		list[i + 1] = list[end];
		list[end] = tempStorageVariable;
		return (i + 1);
	}

	public void quickSortString(String[] list, int beginning, int end)
	{
		++counter;
		if (beginning < end)
		{
			int partIndex = partition(list, beginning, end);
			quickSortString(list, beginning, partIndex - 1);
			quickSortString(list, partIndex + 1, end);
		}
	}
}
