package strings;

public class ToggeleEachword {
	public static void main(String[] args) {
		String str = "my name is khan";
		String words[] = str.split("\\s");
		String toggle = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			String afterfirst = w.substring(1);
			toggle += first.toLowerCase() + afterfirst.toUpperCase() + " ";
		}
	   System.out.println(toggle);
	}
}
