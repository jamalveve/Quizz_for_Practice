package strings;

public class PalindromCheck {

	public static void main(String[] args) {
		String s1 = "ababa";
		StringBuilder stb = new StringBuilder(s1);
		stb.reverse();
		String reversed = stb.toString();
		if (s1.equals(reversed)) {
			System.out.println("palidrome");

		} else {
			System.out.println("not palindrome");
		}
	}
}
