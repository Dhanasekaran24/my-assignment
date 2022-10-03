package week1day2;
    
       import java.util.Arrays;

public class SecondSmallestNo {
	public static void main(String[] args) {
		int a[] = {45,23,67,32,89,22};
		Arrays.sort(a);
		System.out.println("The second smallest no is "+a[1]);
	}
}
