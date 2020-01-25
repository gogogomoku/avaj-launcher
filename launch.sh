#!/bin/sh
rm -f simulation.txt
rm -f sources.txt
find . -name "*.java" > sources.txt
javac @sources.txt
java com.ersesk.simulation.Launcher $@
