import java.util.*;
import java.lang.*;
public class dsexp9a
{
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int partition(int[] arr, int low,int high)
	{
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr, i+1, high);
		return i;
	}
	static void quicksort(int[] arr, int low, int high)
	{
		if(low<high)
		{
			int loc=partition(arr,low,high);
			quicksort(arr,low,loc-1);
			quicksort(arr,loc+1,high);
		}
	}
	static void printarray(int arr[],int l)
	{
		for(int i=0;i<l;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int arr[]={48,8,57,59,28,27};
		int l=arr.length;
		quicksort(arr,0,l-1);
		printarray(arr,l);
	}
}