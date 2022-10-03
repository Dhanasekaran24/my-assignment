package week1day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8;
		int a = 0;
		int b = 1;
		System.out.println(a);
		for(int i = 1; i<=range;i++) {
			int c = a+b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}
}
