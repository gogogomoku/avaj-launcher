#!/bin/sh
find . -name "*.java" > sources.txt
javac @sources.txt
java com.ersesk.simulation.Launcher $@
rm sources.txt