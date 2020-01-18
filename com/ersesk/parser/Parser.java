package com.ersesk.parser;
import java.util.*;
import java.io.File;
import java.lang.Character;

public class Parser {
	public int nSims;
	public ArrayList<AircraftData> aircraftData = new ArrayList<AircraftData>();
    private String errorMessage;
    private static ArrayList<String> validAircraftTypes = new ArrayList<String>(
            Arrays.asList("Balloon", "Baloon", "Helicopter", "JetPlane")
        );

	public Parser(String path) {
        errorMessage = "";

		if (path.isEmpty()) {
			System.out.printf("pathname is empty.");
			return;
		}
		try {
			File file = new File(path);
			Scanner input = new Scanner(file);
			this.nSims = Integer.parseInt(input.nextLine());
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
        // Validate number of arguments
        if (data.length != 5) {
            this.errorMessage = String.format(
                    "Wrong number of arguents in line: %d\n",
                    aircraftData.size()+2
                );
                return;
        }
        // Validate Aircraft type
        String type = data[0];
        if (!validAircraftTypes.contains(type)){
            this.errorMessage = String.format(
                    "%s is not a valid aircraft type in line: %d\n",
                    type,
                    aircraftData.size()+2
                );
                return;
        }
        // Validate Name
        String name = data[1];
        if (name.length() < 1 || name.length() > 10){
            this.errorMessage = String.format(
                    "%s is not a valid name: %d\nName length should be between 1 and 10 characters",
                    name,
                    aircraftData.size()+2
                );
                return;
        }
        if (!Character.isLetter(name.charAt(0))) {
            this.errorMessage = String.format(
                    "%s is not a valid name: %d\nName must start with an alphabetic character",
                    name,
                    aircraftData.size()+2
                );
                return;
        }
        // Validate coordinates
        ArrayList<Integer> coords = new ArrayList<Integer>();
        for (int i = 2 ; i < 5; i++){
            if (data[i].length() > 5){
                this.errorMessage = String.format(
                        "%s is not a valid coordinate: %d\nShould be smaller than 100000",
                        data[i],
                        aircraftData.size()+2
                    );
                    return;
            }
            try {
                int val = Integer.parseInt(data[i]);
                if (val < 0) {
                    this.errorMessage = String.format(
                            "%s is not a valid coordinate: %d\nShould be a positive integer",
                            data[i],
                            aircraftData.size()+2
                        );
                        return;
                }
                if (i == 5 && val > 100){
                    System.out.println("INFO: Any height greater than 100 will be treated as 100");
                }
                coords.add(i -2, val);
            } catch (Exception e){
                this.errorMessage = String.format(
                        "%s is not a valid coordinate: %d\n",
                        data[i],
                        aircraftData.size()+2
                    );
                    return;
            }
        }
        AircraftData aircraftData = new AircraftData(type, name, coords.get(0), coords.get(1), coords.get(2));
        this.aircraftData.add(aircraftData);
    }
}
