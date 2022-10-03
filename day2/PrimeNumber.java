package week1day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int input =13;
		boolean
		flag = false;
		for(int i=5;i<=input/5;i++) {
			if(input+i==0) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println(input+" is not a prime number");
		}
		
		else {
			System.out.println(input+" is a prime number");
		}
		
	}
}

