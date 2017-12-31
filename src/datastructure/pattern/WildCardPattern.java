package datastructure.pattern;

//Java program to implement wildcard pattern matching algorithm
import java.util.Arrays;

public class WildCardPattern {

	public static void main(String args[]) {
		String str = "xaylmz";
		String pattern = "x?y*z";
		if (strmatch(str, pattern, str.length(), pattern.length()))
			System.out.println("String matches the pattern");
		else
			System.out.println("String not matching the pattern");
	}

	public static boolean strmatch(String str, String pattern, int n, int m) {
		if (m == 0 && n == 0)
			return true;

		boolean[][] table = new boolean[n + 1][m + 1];

		for (int i = 0; i < n + 1; i++)
			Arrays.fill(table[i], false);

		table[0][0] = true;

		for (int j = 1; j <= m; j++)
			if (pattern.charAt(j - 1) == '*')
				table[0][j] = table[0][j - 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (pattern.charAt(j - 1) == '*')
					table[i][j] = table[i][j - 1] || table[i - 1][j];

				else if (pattern.charAt(j - 1) == '?'
						|| str.charAt(i - 1) == pattern.charAt(j - 1))
					table[i][j] = table[i - 1][j - 1];

				else
					table[i][j] = false;
			}
		}

		return table[n][m];
	}

}
