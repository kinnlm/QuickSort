/*
 * Class: QuickSortTest.JAVA
 * @Author Logan Kinnaird
 * @Version
 * Course ITEC 2150-07 Spring 2022
 * Written: Apr 15, 2022
 *
 * This class -
 */

import java.util.Arrays;

public class QuickSortTest
{
	public static void main(String[] args)
	{

		QuickSortInt qsInt = new QuickSortInt();
		int[] list = {8,9,3,10,3};
//		System.out.println(Arrays.toString(list));
		qsInt.quickSortInt(list,1,list.length-1);
//		System.out.println(Arrays.toString(list));

	}
}
