import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class CeasarCipher {

	static ArrayList<String> words;
	
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		words = new ArrayList<String>();
		Scanner in = new Scanner(new File("dictionary.txt"));
		while (in.hasNextLine()) words.add(in.nextLine());
		in.close();
		Scanner into = new Scanner(new File("input.txt"));
		String a = "";
		while (into.hasNextLine()) a += into.nextLine();
		into.close();
		PrintWriter write = new PrintWriter("output.txt", "UTF-8");
		String[] b = decode(a);
		String ret = "";
		if (b != null) {
			for (int i = 0; i < b.length; i++) {
				ret += b[i] + " ";
			}
		} else {
			ret = "null";
		}
		write.println(ret);
		write.close();
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
