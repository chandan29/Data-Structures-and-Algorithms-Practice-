package ReverseString;


public class Stack {

	int[] arr;
	int top;
	public Stack(int max) {
		arr=new int[max];
		top=-1;
	}
	
	public Stack() {
		arr=new int[10];
		top=-1;
	}
	
	public void push(int elem) {
		top++;
		arr[top]=elem;
	}
	
	public int pop() {
		int temp=arr[top];
		top--;
		return temp;
	}
	
	public int peek(int elem) {
		return arr[top];
	}
	
	@SuppressWarnings("null")
	public void clear() {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(Integer) null;
			top=-1;
		}
	}
	
	public void printAll() {
		for (int i = top; i >=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	
}
