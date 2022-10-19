package week3day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		String A = "PayPal India";
		
		char[] B = A.toCharArray();
		
		Set <Character> charSet= new LinkedHashSet<Character>();
		Set <Character> dupSet= new LinkedHashSet<Character>();
		for(int i=0;i<B.length;i++) {
			if(!charSet.add(B[i])) {
					dupSet.add(B[i]);
				}
			}
		System.out.println(dupSet);
			charSet.removeAll(dupSet);
		
	
	System.out.println(charSet);
	
	List<Character> List= new ArrayList<Character>(charSet);
	for (int i = 0; i <List.size() ; i++) {
		if(List.get(i)!=' ') {
			System.out.print(List.get(i)); 
		}
	}
	
	
	
	
	
	
	
	}


}
