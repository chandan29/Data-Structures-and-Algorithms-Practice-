package DivisionWithoutDivision;

public class DivideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=10,b=3;
		int i=0;
		while(a>=b) {
			a=a-b;
			i++;
		}
		System.out.println("Quotient is "+i+" and remainder is "+a);
	}

}
