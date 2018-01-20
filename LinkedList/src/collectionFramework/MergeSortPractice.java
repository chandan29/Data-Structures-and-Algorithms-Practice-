package collectionFramework;

public class MergeSortPractice {
	public static void main(String args[]) {
		int[] arr={10,3,4,2,8,13,18};
		mergeSort(arr,0,6);
	}

	private static void mergeSort(int[] arr, int start, int end) {
		if(arr.length<2) {
			System.out.println(arr);
			return;
		}
		if(end<=start) {
			return;
		}
		int mid=(start+end)/2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid+1, end);
		merge(arr,start,mid,end);
		System.out.println(java.util.Arrays.toString(arr));
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int[] temp=new int[end-start+1];
		int left=start;
		int right=mid+1;
		int index=0;
		
		while(left<=mid && right<=end) {
			if(arr[left]<arr[right]) {
				temp[index]=arr[left];
				left++;
			}
			else {
				temp[index]=arr[right];
				right++;
			}
			index++;
		}
		
		while(left<=mid) {
			temp[index]=arr[left];
			left++;
			index++;
		}
		
		while(right<=end) {
			temp[index]=arr[right];
			right++;
			index++;
		}
		
		for (int i = 0; i < temp.length; i++) {
			arr[start+i]=temp[i];
		}
		
	}

	
}
