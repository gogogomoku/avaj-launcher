import com.ersesk.simulation.*;
import com.ersesk.parser.*;

// - TODO: Find linter
// - TODO: Better unique weather messages
public class Main {
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("Usage: java Main <filename>");
			System.exit(0);
		} else {
			Parser parser = new Parser(args[0]);
			new Launcher(parser.nSims, parser.aircraftData);
			System.out.print("Done, exiting.");
			System.exit(0);
		}
	}
}
