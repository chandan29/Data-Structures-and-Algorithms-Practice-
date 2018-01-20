package mergesort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,2,3,11,23,5,7};
		mergeSort(arr,0,arr.length-1);
	}

	private static void mergeSort(int[] arr,int p,int r) {
		if(r<=p) {
			//System.out.println(java.util.Arrays.toString(arr));
			return;
		}
			int q=(p+r)/2;
			mergeSort(arr, p, q);
			mergeSort(arr, q+1, r);
			merge(arr,p,q,r);
		
	}

	private static void merge(int[] arr, int p, int q, int r) {
		int[] temp=new int[r-p+1];
		int lslot=p;
		int rslot=q+1;
		int k=0;
		
		while(lslot<=q && rslot<=r) {
			if(arr[lslot]<arr[rslot]) {
				temp[k]=arr[lslot];
				lslot++;
			}
			else {
				temp[k]=arr[rslot];
				rslot++;
			}
			k++;
		}
		
		if(lslot<=q) {
			while(lslot<=q) {
				temp[k]=arr[lslot];
				lslot++;
			}
			k++;
		}
		
		if(rslot<=r) {
			while(rslot<=r) {
				temp[k]=arr[rslot];
				rslot++;
			}
			k++;
		}
		for (int i = 0; i < temp.length; i++) {
			arr[p+i]=temp[i];
		}
		System.out.println(java.util.Arrays.toString(arr));
		
	}

}
