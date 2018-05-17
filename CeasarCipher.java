import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CeasarCipher {

	static ArrayList<String> words;
	
	public static void main(String[] args) throws FileNotFoundException {
		words = new ArrayList<String>();
		Scanner in = new Scanner(new File("dictionary"));
		while (in.hasNextLine()) words.add(in.nextLine());
		in.close();
		String a = "input your code here";
		System.out.println(Arrays.toString(decode(a)));
	}
	
	public static String[] decode(String in) {
		String[] code = in.split("\\s+");
		int count = 0;
		for (int shift = 0; shift < 26; shift++) {
			for (int i = 0; i < code.length; i++) {
				code[i] = shift(code[i]);
			}
			for (int i = 0; i < code.length; i++) {
				for (String s : words) {
					if (s.equalsIgnoreCase(code[i])) count++;
				}
			}
			if (count == code.length) {
				return code;
			} else {
				count = 0;
			}
		}
		return null;
	}
	
	public static String shift(String in) {
		String out = "";
		for (char c : in.toCharArray()) {
			if(c == 'z') {
				c = 'a';
			} else {
				c = (char) ((int) c + 1);
			}
			out += c;
		}
		return out;
	}

}
