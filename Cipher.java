package cipher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cipher {
	public static ArrayList<String> dictionaryList = new ArrayList<String>();
	public static String[] words;
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("dictionary.txt");
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			dictionaryList.add(scanner.nextLine());
		}
		words = new String[dictionaryList.size()];
		dictionaryList.toArray(words);
		Scanner input = new Scanner(System.in);
		String word = input.next();
		int wordLength = word.length();
		ArrayList<ArrayList<Integer>> repeats = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < wordLength; i++) {
			for (int j = i + 1; j < wordLength; j++) {
				if (word.charAt(i) == word.charAt(j)) {
					ArrayList<Integer> repeat = new ArrayList<Integer>();
					repeat.add(i);
					repeat.add(j);
					repeats.add(repeat);
				}
			}
		}
		System.out.print(possibilities(repeats, wordLength));
		scanner.close();
		input.close();
	}

	public static ArrayList<String> possibilities(ArrayList<ArrayList<Integer>> repeats, int wordLength) {
		ArrayList<String> possibilities = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			boolean valid = true;
			if (words[i].length() != wordLength) {
				valid = false;
			} else {
				for (int j = 0; j < repeats.size(); j++) {
					if (words[i].charAt(repeats.get(j).get(0)) != words[i].charAt(repeats.get(j).get(1))) {
						valid = false;
					}
				}
			}
			if (valid) {
				possibilities.add(words[i]);
			}
		}
		return possibilities;
	}
}
