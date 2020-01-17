package parser;
import java.util.Scanner;
import java.io.File;

public class Parser {
	public static boolean checkFileValidity(String path) {
		if (path.isEmpty()) {
			return false;
		}
		try {
			// File file =
			File file = new File(path);
			Scanner input = new Scanner(file);
			System.out.println(input.nextLine());
			input.close();
			// File file = new File(input.nextLine());
			return true;
		} catch (Exception e) {
			System.out.printf("There was an error: %s\n", e);
			return false;
		}
	}
}
