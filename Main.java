import com.ersesk.simulation.*;
import com.ersesk.parser.*;

// - TODO: Check we are giving unique ID to each Flyable
// - TODO: Respect format of message when weather chagnes
// - TODO: Take coordinates into account for weather generation
// - TODO: Find linter
public class Main {
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("Usage: java Main <filename>");
			System.exit(0);
		} else {
			Parser parser = new Parser(args[0]);
            Launcher launcher = new Launcher(parser.nSims, parser.aircraftData);
			System.out.print("Done");
			System.exit(0);
		}
	}
}
