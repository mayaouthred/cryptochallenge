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
		ArrayList<ArrayList<Integer>> differences = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < wordLength; i++) {
			for (int j = i + 1; j < wordLength; j++) {
				if (word.charAt(i) == word.charAt(j)) {
					ArrayList<Integer> repeat = new ArrayList<Integer>();
					repeat.add(i);
					repeat.add(j);
					repeats.add(repeat);
				} else {
					ArrayList<Integer> difference = new ArrayList<Integer>();
					difference.add(i);
					difference.add(j);
					differences.add(difference);
				}
			}
		}
		ArrayList<Key> possibilities = possibilities(repeats, differences, wordLength, word);
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

	public static ArrayList<Key> possibilities(ArrayList<ArrayList<Integer>> repeats,
			ArrayList<ArrayList<Integer>> differences, int wordLength, String word) {
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
				for (int j = 0; j < differences.size(); j++) {
					if (wordPossibility.charAt(differences.get(j).get(0)) == wordPossibility
							.charAt(differences.get(j).get(1))) {
						valid = false;
					}
				}
			}
			if (valid) {
				System.out.println(wordPossibility);
				Key key = new Key();
				for (int j = 0; j < word.length(); j++) {
					char c = word.charAt(j);
					char c2 = wordPossibility.charAt(j);
					if (c == 'a' || c == 'A') {
						key.setA(c2);
					} else if (c == 'b' || c == 'B') {
						key.setB(c2);
					} else if (c == 'c' || c == 'C') {
						key.setC(c2);
					} else if (c == 'd' || c == 'D') {
						key.setD(c2);
					} else if (c == 'e' || c == 'E') {
						key.setE(c2);
					} else if (c == 'f' || c == 'F') {
						key.setF(c2);
					} else if (c == 'g' || c == 'G') {
						key.setG(c2);
					} else if (c == 'h' || c == 'H') {
						key.setH(c2);
					} else if (c == 'i' || c == 'I') {
						key.setI(c2);
					} else if (c == 'j' || c == 'J') {
						key.setJ(c2);
					} else if (c == 'k' || c == 'K') {
						key.setK(c2);
					} else if (c == 'l' || c == 'L') {
						key.setL(c2);
					} else if (c == 'm' || c == 'M') {
						key.setM(c2);
					} else if (c == 'n' || c == 'N') {
						key.setN(c2);
					} else if (c == 'o' || c == 'O') {
						key.setO(c2);
					} else if (c == 'p' || c == 'P') {
						key.setP(c2);
					} else if (c == 'q' || c == 'Q') {
						key.setQ(c2);
					} else if (c == 'r' || c == 'R') {
						key.setR(c2);
					} else if (c == 's' || c == 'S') {
						key.setS(c2);
					} else if (c == 't' || c == 'T') {
						key.setT(c2);
					} else if (c == 'u' || c == 'U') {
						key.setU(c2);
					} else if (c == 'v' || c == 'V') {
						key.setV(c2);
					} else if (c == 'w' || c == 'W') {
						key.setW(c2);
					} else if (c == 'x' || c == 'X') {
						key.setX(c2);
					} else if (c == 'y' || c == 'Y') {
						key.setY(c2);
					} else {
						key.setZ(c2);
					}
				}
				possibilities.add(key);
			}
		}
		return possibilities;
	}
}