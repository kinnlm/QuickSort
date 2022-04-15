/*
 * Class: QuickSort003.JAVA
 * @Author Logan Kinnaird
 * @Version
 * Course ITEC 2150-07 Spring 2022
 * Written: Apr 10, 2022
 *
 * This class - Quick sort for strings
 */

/*
@see https://www.javatpoint.com/quick-sort
*/
public class QuickSort003
{
/**
 * @param counter count how many steps it takes to order data
 */
	public int counter = 0;

	int partition(String[] list, int beginning, int end)
	{
		String pivot = list[end];
		int i = beginning - 1;

		for (int j = beginning; j <= end; j++)
		{
			if (list[i].compareTo(pivot) < 0)
			{
				i++;
				String storageVariable = list[i];
				list[i] = list[j];
				list[j] = storageVariable;
			}
		}

		String storageVariable = list[i + 1];
		list[i + 1] = list[end];
		list[end] = storageVariable;
		return (i + 1);
	}

	void quickSort003(String[] list, int beginning, int end)
	{
		++counter;
		if (beginning < end)
		{
			int partIndex = partition(list, beginning, end);
			quickSort003(list, beginning, partIndex - 1);
			quickSort003(list, partIndex + 1, end);
		}
	}
}
