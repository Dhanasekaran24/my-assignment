package week3Day1;

import java.util.Arrays;

public class Anagram {
    
	public static void main(String[] args) {
		String a = "stops";
		String b = "potss";
		int count=0;
		boolean check = a.length()==b.length();
		System.out.println(check);
		char[] C = a.toCharArray();
		char[] D = b.toCharArray();
		Arrays.sort(C);
		Arrays.sort(D);
		for(int i=0;i<C.length;i++) {
			if(C[i]!=D[i]) {
				count++;
			
			}
		}
		if(count>0) {
			System.out.println("The characters are not same");
		}else {
			System.out.println("The characters  are  same");
		}
	}
}
