// Java program to Compare two strings
// lexicographically
public class GFG {

	// This method compares two strings
	// lexicographically without using
	// library functions
	public static Boolean stringCompare(String str1,
										String str2)
	{

		int l1 = str1.length();
		int l2 = str2.length();
		int lmin = Math.min(l1, l2);

		for (int i = 0; i < lmin; i++) {
			int str1_ch = (int)str1.charAt(i);
			int str2_ch = (int)str2.charAt(i);

			if (str1_ch != str2_ch) {
				return false;
			}
		}

		// Edge case for strings like
		if (l1 != l2) {
			return false;
		}

		// If none of the above conditions is true,
		//It implies both the strings are equal
		else {
			return true;
		}
	}

	// Driver function to test the above program
	public static void main(String args[])
	{
		String string1 = new String("String");
		String string2 = new String("Practice");
		String string3 = new String("Hello");
		String string4 = new String("Hello");

		// Comparing for String 1 < String 2
		System.out.println(
			"Comparing " + string1 + " and " + string2
			+ " : " + stringCompare(string1, string2));

		// Comparing for String 3 = String 4
		System.out.println(
			"Comparing " + string3 + " and " + string4
			+ " : " + stringCompare(string3, string4));

		// Comparing for String 1 > String 4
		System.out.println(
			"Comparing " + string1 + " and " + string4
			+ " : " + stringCompare(string1, string4));
	}
}
