package selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {10,2,3,11,23,5,7};
		selSort(arr);
	}

	private static void selSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min=i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
		System.out.println(java.util.Arrays.toString(arr));
	}

}
