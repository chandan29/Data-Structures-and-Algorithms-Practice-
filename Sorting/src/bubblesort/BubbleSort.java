package bubblesort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,1,6,2,7,5,11,9};
		int[] a=bubble(arr);
		System.out.println(java.util.Arrays.toString(a));
	}

	private static int[] bubble(int[] arr) {
		// TODO Auto-generated method stub
		for(int j=0;j<arr.length-1;j++) {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		}
		return arr;
	}

}
