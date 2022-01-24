package week1.day1;

public class LearnAccessModifier {
	public int a = 5;
	private int b = 6;
	int c = 7;
	public void method1() {
		System.out.println("Public Method");
	}
	private void method2() {
		System.out.println("Private Method");
	}
	void method3() {
		System.out.println("Default Method");
	}
	public static void main(String[] args) {
		
		LearnAccessModifier lam = new LearnAccessModifier();
		int a2 = lam.a;
		lam.method1();
		int b2 = lam.b;
		lam.method2();
		int c2 = lam.c;
		lam.method3();
	}


}
