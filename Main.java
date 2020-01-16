import aircraft.*;

public class Main {
	public static void main(String[] args){
		if (args.length != 1){
			System.out.println("Usage: java Main <filename>");
			System.exit(0);
		} else {
			new Launcher();
			System.out.print("Done");
			System.exit(0);
		}
	}
}
