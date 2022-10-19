package week3day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String input = "babu";
		char[] name = input.toCharArray();
		char dup = 0;
		Set <Character> A = new HashSet<Character>();
		for(int a=0;a<name.length;a++) {
			if(!A.add(name[a])) {
				dup=name[a];
				A.remove(dup);
			}
		}
		
		
		System.out.println("The characters are : "+A);
		

	}


}
