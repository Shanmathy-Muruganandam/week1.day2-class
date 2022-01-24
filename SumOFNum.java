package week1.day2;

public class SumOFNum {
	public static void main(String[] args) {
		int i, range = 5, sum = 0; 
		for(i = 1; i <= range; ++i) {
			sum = sum + i;  
		}
		System.out.println("Sum of range "+range+" = " + sum);
	}

}
