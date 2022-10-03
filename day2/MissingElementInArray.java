package week1day2;
 
     import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8};
		Arrays.sort(arr);
	    int b = arr.length;
	    int i = 1;
	    while(i<b) {
	    	if((i != arr[i]-1)) {
	    		System.out.println("The missing element is "+(i+1));
	    		
	    		break;
	    	}
	    	++i;
	    } 
	}
}
