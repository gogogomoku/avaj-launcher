package parser;
import java.util.Scanner;
import java.io.File;

public class Parser {
	public int nSims;
	public AircraftData[] aircraftData;

	public Parser(String path) {
		// todo: Proper error handling
		if (path.isEmpty()) {
			System.out.printf("pathname is empty.");
			return;
		}
		try {
			File file = new File(path);
			Scanner input = new Scanner(file);
			this.nSims = Integer.parseInt(input.nextLine());
			System.out.printf("nSims: %d\n", nSims);
			while (input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			input.close();
			return;
		} catch (Exception e) {
			// todo: Proper error handling
			System.out.printf("There was an error: %s\n", e);
			return;
		}
	}
}
