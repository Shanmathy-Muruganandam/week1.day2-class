package week1.day2;

public class LearnString {
	public static void main(String[] args) {
		String name1 = "Baalaajee";
		String name2 = new String("Baalaajee");
		String name3 = "Baalaajee";
		String name4 = new String("Baalaajee");
		String name5 = new String("Durai ");
		String name6 = new String("Vengkades");
		if (name1==name2) {//unequal because it takes memory
			System.out.println("Equals"); 
		} else {
			System.out.println("UnEquals");
		}
		if (name1==name3) {//equal because it takes memory
			System.out.println("Equals"); 
		} else {
			System.out.println("UnEquals");
		}
		if (name2==name4) {//unequal because it takes memory
			System.out.println("Equals"); 
		} else {
			System.out.println("UnEquals");
		}
		if (name1.equals(name2)) {//equal because it takes literals
			System.out.println("Equals"); 
		} else {
			System.out.println("UnEquals");
		}
		int len = name1.length();
		System.out.println(len);
		
		String concat = name5.concat(name6);
		System.out.println(concat);
		
		String lowercase = name5.toLowerCase();
		System.out.println(lowercase);
		
		String uppercase = name5.toUpperCase();
		System.out.println(uppercase);
		
		String txt = "   Durai Venkgades   ";
		String trim = txt.trim();
		System.out.println(trim);
		
		String txt1 = "Durai Venkgades";
		String txt2 = "Durai venkgades";
		
		boolean equals = txt1.equals(txt2);
		System.out.println(equals);
		
		boolean equalIgnoreCase = txt1.equalsIgnoreCase(txt2);
		System.out.println(equalIgnoreCase);
		
		String txt3 = "Testleaf is in Chennai";
		boolean contains = txt3.contains("leaf");
		System.out.println(contains);
		
		char charAt = txt1.charAt(3);
		System.out.println(charAt);
		
		char[] charArr = txt1.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			System.out.println(charArr[i]);
		}
		
		String[] split = txt3.split("");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		String txt4 = "Since 2005";
		String substring = txt4.substring(5);
		System.out.println(substring);
		
		String substring1 = txt4.substring(6, 10);
		System.out.println(substring1);
		
		String replaceAll = txt4.replaceAll("[a-zA-Z]", " ");
		System.out.println(replaceAll);
		
		String replace = txt4.replace('0', '$');
		System.out.println(replace);
	}
}
