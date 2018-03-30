package cipher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Cipher {
	public static ArrayList<String> dictionaryList = new ArrayList<String>();
	public static String[] words;

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("dictionary.txt");
		File outputFile = new File("output.txt");
		PrintStream output = new PrintStream(outputFile);
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
		ArrayList<Key> possibilities = possibilities(repeats, wordLength, word);
		for (int i = 0; i < possibilities.size(); i++) {
			for (int j = 0; j < 26; j++) {
				output.print(possibilities.get(i).toArray()[j] + " ");
			}
			output.println(i);
		}
		scanner.close();
		input.close();
		output.close();
	}

	public static ArrayList<Key> possibilities(
			ArrayList<ArrayList<Integer>> repeats, int wordLength, String word) {
		ArrayList<Key> possibilities = new ArrayList<Key>();
		String wordPossibility;
		for (int i = 0; i < words.length; i++) {
			boolean valid = true;
			wordPossibility = words[i];
			if (wordPossibility.length() != wordLength) {
				valid = false;
			} else {
				for (int j = 0; j < repeats.size(); j++) {
					if (wordPossibility.charAt(repeats.get(j).get(0)) != wordPossibility
							.charAt(repeats.get(j).get(1))) {
						valid = false;
					}
				}
			}
			if (valid) {
				System.out.println(wordPossibility);
				Key key = new Key();
				for (int j = 0; j < word.length(); j++) {
					if (word.charAt(j) == 'a' || word.charAt(j) == 'A') {
						key.setA(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'b' || word.charAt(j) == 'B') {
						key.setB(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'c' || word.charAt(j) == 'C') {
						key.setC(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'd' || word.charAt(j) == 'D') {
						key.setD(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'e' || word.charAt(j) == 'E') {
						key.setE(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'f' || word.charAt(j) == 'F') {
						key.setF(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'g' || word.charAt(j) == 'G') {
						key.setG(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'h' || word.charAt(j) == 'H') {
						key.setH(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'i' || word.charAt(j) == 'I') {
						key.setI(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'j' || word.charAt(j) == 'J') {
						key.setJ(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'k' || word.charAt(j) == 'K') {
						key.setK(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'l' || word.charAt(j) == 'L') {
						key.setL(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'm' || word.charAt(j) == 'M') {
						key.setM(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'n' || word.charAt(j) == 'N') {
						key.setN(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'o' || word.charAt(j) == 'O') {
						key.setO(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'p' || word.charAt(j) == 'P') {
						key.setP(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'q' || word.charAt(j) == 'Q') {
						key.setQ(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'r' || word.charAt(j) == 'R') {
						key.setR(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 's' || word.charAt(j) == 'S') {
						key.setS(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 't' || word.charAt(j) == 'T') {
						key.setT(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'u' || word.charAt(j) == 'U') {
						key.setU(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'v' || word.charAt(j) == 'V') {
						key.setV(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'w' || word.charAt(j) == 'W') {
						key.setW(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'x' || word.charAt(j) == 'X') {
						key.setX(wordPossibility.charAt(j));
					} else if (word.charAt(j) == 'y' || word.charAt(j) == 'Y') {
						key.setY(wordPossibility.charAt(j));
					} else {
						key.setZ(wordPossibility.charAt(j));
					}
				}
				possibilities.add(key);
			}
		}
		return possibilities;
	}
}