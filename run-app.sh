#!/bin/bash

# Build your project
./mvnw clean package

# Run your project
java -jar ~/Desktop/demo/target/demo-0.0.1-SNAPSHOT.jar

