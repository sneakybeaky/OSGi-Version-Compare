# OSGi version comparison

This simple project allows you to compare two OSGi version strings and see which an OSGi runtime would regard as the greatest.

## Installation

You will need maven 2+ and Java 6+. To build the package do

    $ mvn clean package

## Usage

To do a comparison :

    $ java -jar target/version-cli-1.0-SNAPSHOT-jar-with-dependencies.jar 0.0.2.99 0.0.2.100
    Comparing '0.0.2.99' OSGi version with '0.0.2.100'
    '0.0.2.99' is greater than '0.0.2.100'

