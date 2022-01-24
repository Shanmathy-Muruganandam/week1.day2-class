package week1.day2;

import java.util.Arrays;

public class LearnArray {
	public static void main(String[] args) {
		String name1 = "Baalaajee";
		String name2 = "Durai";
		String name3 = "Venkgades";
		String name4 = "Usha";
		String name5 = "Muruku";
		//String literals->implicit
		String[] names = {"Baalaajee","Durai","Venkgades","Usha","Muruku"};
		System.out.println(names[2]);
		int length = names.length;
		System.out.println("length of the array: "+ length);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		//object-> explicit
		String[] names1 = new String[5];
		names1[0] = "Baalaajee";
		names1[1] = "Durai";
		names1[2] = "Venkgades";
		names1[3] = "Usha";
		names1[4] = "Muruku";
		int len = names1.length;
		System.out.println(len);
		for (int i = 0; i < names1.length; i++) {
			System.out.println(names1[i]);
		}
		Arrays.sort(names1);
		for (int i = 0; i < names1.length; i++) {
			System.out.println(names1[i]);
		}
		System.out.println(names1[3]);
	}

}
