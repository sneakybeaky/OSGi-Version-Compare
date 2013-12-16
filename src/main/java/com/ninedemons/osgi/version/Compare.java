package com.ninedemons.osgi.version;

import org.osgi.framework.Version;

/**
 * Compares two OSGi version strings and displays the result to stdout
 */
public class Compare {

    public static void printUsage() {
        System.err.println("java com.ninedemons.osgi.version.Compare VERSION1 VERSION2");
        System.err.println("  Example: java com.ninedemons.osgi.version.Compare 1.0.0.99 1.0.0.100 ");
    }


    public static void main(String[] args) {
        checkEnoughArguments(args);
        showComparison(getVersionFromArgument(args[0]), getVersionFromArgument(args[1]));
    }

    private static void showComparison(Version first, Version second) {

        System.out.println("Comparing '" + first + "' OSGi version with '" + second + "'");

        int comparison = first.compareTo(second);

        if (comparison < 0) {
            System.out.println("'" + second + "' is greater than '" + first + "'");

        } else if (comparison == 0) {
            System.out.println("'" + second + "' is equivalent to '" + first + "'");

        } else {
            System.out.println("'" + first + "' is greater than '" + second + "'");

        }
    }

    private static Version getVersionFromArgument(String versionAsString) {

        Version result = null;

        try {
            result =  new Version(versionAsString);
        } catch (IllegalArgumentException iae) {
            System.err.println("'" + versionAsString + "' is not a valid OSGi version string");
            System.err.println();
            printUsage();
            System.exit(1);
        }

        return result;
    }

    private static void checkEnoughArguments(String[] args) {
        if (args.length != 2) {
            System.err.println("You must supply 2 version strings");
            System.err.println();
            printUsage();
            System.exit(1);
        }
    }
}
