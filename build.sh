#! /bin/bash
mvn clean package
mkdir output
mv target/*.jar output