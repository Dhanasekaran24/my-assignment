package week3Day1;

public class Palindrome {
	
	public static void main(String[] args) {
		String A= "madam";
		String rev="";
		char[] c= A.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			rev=rev+ c[i];
			}
		System.out.println("The reversed  value is "+rev);
		System.out.println("The given value "+A+" is  palindrome -"+rev.equalsIgnoreCase(A));
		
	}

}
