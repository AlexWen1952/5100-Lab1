package edu.neu.mgen;

import java.util.ArrayList;

public class HelloApp {
    public static void main(String[] args) {
        int[] x = {1, 4, 7, 3, 9};
        int[] y = {2, 5, 8, 6, 1};

        int[] z = new int[5];

        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.print("Array x = { ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i < x.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        
        System.out.print("Array y = { ");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);
            if (i < y.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.print("Array z = x + y = { ");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
            if (i < z.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

    ArrayList<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Alan");
        names.add("Bran");
        names.add("Emliy");
        names.add("Chellsea");

        ArrayList<String> switchedNames = switchFirstAndLastLetters(names);

        System.out.print("Names = { ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i));
            if (i < names.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");

        System.out.print("Names (switched) = { ");
        for (int i = 0; i < switchedNames.size(); i++) {
            System.out.print(switchedNames.get(i));
            if (i < switchedNames.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
    private static ArrayList<String> switchFirstAndLastLetters(ArrayList<String> names) {
        ArrayList<String> switchedNames = new ArrayList<>();
        for (String name : names) {
            switchedNames.add(switchLetters(name));
        }
        return switchedNames;
    }

    private static String switchLetters(String name) {
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);
        return Character.toUpperCase(lastLetter) + name.substring(1, name.length() - 1) + Character.toLowerCase(firstLetter);
    }
}
