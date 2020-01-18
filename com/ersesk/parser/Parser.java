package com.ersesk.parser;
import java.util.*;
import java.io.File;

public class Parser {
	public int nSims;
	public AircraftData[] aircraftData;
    private String errorMessage;
    private static ArrayList<String> validAircraftTypes = new ArrayList<String>(
            Arrays.asList("Balloon", "Helicopter", "JetPlane")
        );

	public Parser(String path) {
        aircraftData = new AircraftData[]{};
        errorMessage = "";

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
                validateLine(input.nextLine());
                if (!errorMessage.isEmpty()){
                    System.out.println(errorMessage);
                    break;
                }
			}
			input.close();
			return;
		} catch (Exception e) {
			// todo: Proper error handling
			System.out.printf("There was an error: %s\n", e);
			return;
		}
	}

    private void validateLine(String line){
        String data[] = line.split(" ");
        if (data.length != 5) {
            this.errorMessage = String.format(
                    "Wrong number of arguents in line: %d\n",
                    aircraftData.length+2
                );
                return;
        }
        if (!validAircraftTypes.contains(data[0])){
            this.errorMessage = String.format(
                    "%s is not a valid aircraft type in line: %d\n",
                    data[0],
                    aircraftData.length+2
                );
                return;
        }
    }


}
