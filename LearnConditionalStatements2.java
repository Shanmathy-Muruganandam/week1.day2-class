package week1.day2;

public class LearnConditionalStatements2 {
	public static void main(String[] args) {
		int mark = 70;
		if ((mark<=100)&&(mark>=90)) {
			System.out.println("Mark: "+mark+"\n\t Grade:A");
		}else if ((mark<=90)&&(mark>=80)) {
			System.out.println("Mark: "+mark+"\n\t Grade:B");
		}else if ((mark<=80)&&(mark>=70)) {
			System.out.println("Mark: "+mark+"\n\t Grade:C");
		}else if ((mark<=70)&&(mark>=60)) {
			System.out.println("Mark: "+mark+"\n\t Grade:D");
		}else if ((mark<=60)&&(mark>=35)) {
			System.out.println("Mark: "+mark+"\n\t Grade:E");
		}
		else {
			System.out.println("Mark: "+mark+"\n\t Grade:F");
		}
	}

}
