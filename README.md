# avaj-launcher

This introductory project to Object-Oriented Programming asked for a small air traffic control simulation program corresponding to a provided UML file.

Running the program with an input file will create a logfile `simulation.txt`, a weather tower's record of aircraft coordinates, exchanged messages in response to changes in weather, and registration to/from this tower.

tl;dr:

```shell
find . -name "*.java" > sources.txt
javac @sources.txt
java [-v | --verbose] com.ersesk.simulation.Launcher FILENAME
```

or simply:

```shell
sh ./launch.sh FILENAME
```

Then check the output file:

```shell
cat -e simulation.txt
```

## Test it works with Java 7

This project required compatibility with Java 7.

The dockerfile will run the launch script (thus the java compiler) using OpenJDK 7.

```shell
docker build -t avaj .
docker run -it avaj
cat simulation.txt
```
