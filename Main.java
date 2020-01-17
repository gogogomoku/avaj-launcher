import aircraft.*;
import parser.*;

public class Main {
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("Usage: java Main <filename>");
			System.exit(0);
		} else {
			Parser.checkFileValidity(args[0]);
			// new Launcher();
			System.out.print("Done");
			System.exit(0);
		}
	}
}
