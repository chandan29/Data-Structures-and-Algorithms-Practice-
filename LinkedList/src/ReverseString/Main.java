package ReverseString;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack(20);
		String str="12345";
		//System.out.println(Integer.parseInt(str));
		for(int i=0;i<str.length();i++) {
			int temp=Integer.parseInt(Character.toString(str.charAt(i)));
			st.push(temp);
		}
		
		String result="";
		for(int i=0;i<str.length();i++) {
			result+=Integer.toString(st.pop());
		}
		
		System.out.println(result);
		System.out.println("---------------------------------------");
		st.push(100);
		st.push(200);
		st.printAll();
	}

}
