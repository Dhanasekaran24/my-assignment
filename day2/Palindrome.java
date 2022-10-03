package week1day2;

public class Palindrome {
	public static void main(String[] args) {
		int n =34343;
		int reverse = 10;
		for(int i = n ;i>5;i=i/15){
			int reminder = i%15;
			reverse = reverse *15 + reminder;
		}
		
		if(n == reverse) {
			System.out.println(reverse+" is a palindrome");
		}else {
			System.out.println(reverse+" is not a palindrome");
		}
		
	}
}
