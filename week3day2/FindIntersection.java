package week3day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	
	public static void main(String[] args) {
		int[] A = {3,2,11,4,6,7};
		int[] B = {1,2,8,4,9,7};
		
		List<Integer> C= new ArrayList<Integer>();
		List<Integer> D= new ArrayList<Integer>();
		
		for(int i=0;i<A.length;i++) {
			
			C.add(A[i]);
			D.add(B[i]);
			
		}
		
		System.out.println("The list 1 : "+C);
		System.out.println("The list 2 : "+D);
		System.out.println("The intersection numbers are : ");
		
		for(int x=0;x<B.length;x++) {
			for(int y=0;y<B.length;y++) {
				if(C.get(x)==D.get(y)) {
					System.out.println(+C.get(x));
		}
		}
	}
	}
}
