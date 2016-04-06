import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {
		System.out.println("Enter The English Phrase To Be " + "Translated Into 'Pig Latin' : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.toLowerCase();
		System.out.println(toPigLatin(input));
		sc.close();
	}

	public static String toPigLatin(String str) {
		String vowels = "aeiou";
		String[] words = str.split(" ");
		StringBuffer pigLatin = new StringBuffer();

		for (int i = 0; i < words.length; i++) {
			if (vowels.indexOf(words[i].charAt(0)) >= 0) {
				pigLatin.append(words[i] + "way ");
			} else {
				for (int x = 1; x < words[i].length(); x++) {
					if (vowels.indexOf(words[i].charAt(x)) >= 0) {
						pigLatin.append(words[i].substring(x) + words[i].substring(0, x) + "ay ");
						break;
					}
				}
			}
		}
		return pigLatin.toString();
	}
}