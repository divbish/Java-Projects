package project1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class EncrypterDecrypter {
	static Character[] allAsciiCharacters = new Character[95];
	static Character[] allAsciiEncrypted = new Character[95];

	public static void main(String[] args) {
		String userInput, decision, exit;
		char[] encryptedUserArray;
		char[] decryptedUserArray;

		allAsciiCharacters = getAsciiCharacters();
		for (int i = 0; i < allAsciiCharacters.length; i++) {
			allAsciiEncrypted[i] = (char) allAsciiCharacters[i];
		}
		Collections.shuffle(Arrays.asList(allAsciiEncrypted));
		
		while(true){
			System.out.println("Enter a string");
			Scanner keyboard = new Scanner(System.in);
			userInput = keyboard.nextLine();
			System.out.println("Do you want to encrypt [y/n]?");
			decision = keyboard.nextLine();
			if (decision.equalsIgnoreCase("y")) {
				encryptedUserArray = encryptUserArray(userInput.toCharArray());
				 System.out.println(encryptedUserArray);
			} else if (decision.equalsIgnoreCase("n")) {
				
				decryptedUserArray = decryptUserArray(userInput.toCharArray());
				System.out.println(decryptedUserArray);
			}
			System.out.println("Do you want to exit the program [y/n]");
			exit = keyboard.nextLine();
			if (exit.equalsIgnoreCase("y")) {
				break;
			}
		}
		System.out.println("Thanks for using the program, bye!");
	}

	private static char[] encryptUserArray(char[] userInput) {
		char[] encryptedUserArray = new char[userInput.length];
		for (int i = 0; i < userInput.length; i++) {
			encryptedUserArray[i] = allAsciiEncrypted[search(allAsciiCharacters, userInput[i])];
		}
		return encryptedUserArray;
	}

	private static char[] decryptUserArray(char[] userInput) {
		char[] decryptedUserArray = new char[userInput.length];
		for (int i = 0; i < userInput.length; i++) {
			decryptedUserArray[i] = allAsciiCharacters[search(allAsciiEncrypted, userInput[i])];
		}
		return decryptedUserArray;
	}

	private static Character[] getAsciiCharacters() {
		Character[] allAscii = new Character[95];
		for (int i = 32; i <= 126; i++) {
			allAscii[i - 32] = (char) i;
		}
		return allAscii;
	}

	private static int search(Character[] a, Character c) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == c)
				return i;
		return -1;
	}

}
