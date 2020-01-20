#!/bin/sh
rm -f simulation.txt
find . -name "*.java" > sources.txt
javac @sources.txt
java com.ersesk.simulation.Launcher $@
rm sources.txt