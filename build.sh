#! /bin/bash
#export JAVA_HOME=/usr/local/jdk1.8.0_201
#export M2_HOME=/usr/local/apache-maven-3.6.0
mvn clean package
mkdir output
mv target/*.jar output