package Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(isAnagram(a, b));
		sc.close();
	}

	public static boolean isAnagram(String a, String b) {
		String a1 = a.replace(" ", "").toLowerCase();
		String b2 = b.replace(" ", "").toLowerCase();

		if (a1.length() != b2.length()) {
			return false;
		}

		char[] charArray1 = a1.toCharArray();
		char[] charArray2 = b2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);
	}
}
