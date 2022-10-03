package week1day2;

public class ConvertNegativeNoToPostiveNo {
	public static void main(String[] args) {
		int a = -40;
		int b = a;
		
		if(a<0) {
			a=a*-1;
		}
		
		if(a != b) {
			System.out.println("The number "+b+" is converted to "+a);
		}
	}
}
