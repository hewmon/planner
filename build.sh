#!/bin/bash
javac -classpath .:ui \
    planner/Application.java \
    planner/Weekday.java \
    planner/ui/MainWindow.java \
    planner/ui/TimeBlockTable.java