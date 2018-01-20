package quicksort;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {5,2,7,2,45,7,95,2,234,7,4};
		quickSort(arr,0,arr.length-1);
	}

	private static void quickSort(int[] arr, int p, int r) {
		// TODO Auto-generated method stub
		if(p<r) {
			int q=partition(arr,p,r);
			quickSort(arr, p, q-1);
			quickSort(arr, q+1, r);
		}
		System.out.println(java.util.Arrays.toString(arr));
		
	}

	private static int partition(int[] arr, int p, int r) {
		// TODO Auto-generated method stub
		int pivot=arr[r];
		int i=p;
		for(int j=p;j<r;j++) {
			if(arr[j]<=pivot) {
				
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;	
				i++;
			}
		}
		int temp=arr[i];
		arr[i]=arr[r];
		arr[r]=temp;
		return i;
	}



}
