package collectionFramework;

public class QuickSortPractice {

	public static void main(String[] args) {
		int[] arr= {10,2,5,7,12,56,6,13,9};
		quickSort(arr,0,arr.length-1);
		System.out.println(java.util.Arrays.toString(arr));

	}

	private static void quickSort(int[] arr, int start, int end) {
		if(start<end) {
		int mid=partition(arr,start,end);	
		quickSort(arr,start,mid-1);
		quickSort(arr, mid+1, end);
		}
		else {
			return;
		}
	}

	private static int partition(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int pivot=arr[end];
		int index=start;
		for (int i = start; i < end; i++) {
			if(arr[i]<=pivot) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;	
			}
			
		}
		int temp=arr[index];
		arr[index]=arr[end];
		arr[end]=temp;
		return index;
	}

}
