package insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,2,3,11,23,5,7};
		insSort(arr);
	}

	private static void insSort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			int element=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>element) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=element;
		}
		System.out.println(java.util.Arrays.toString(arr));
	}

}
