package ru.vsu.amm.labs;

import java.util.Scanner;

/**
 * 3. Для произвольного класса найти его суперкласс.
 */
public class Main {
    public static void main(String[] args) {
        String className;
        if (args.length > 0) {
            className = args[0];
        } else {
            System.out.print("Enter the class name: ");
            className = new Scanner(System.in).next();
        }
        String superclassName;
        try {
            superclassName = FindSuperclass.getSuperclassName(className);
            System.out.println("Superclass for " + className + " is " + superclassName);
        } catch (ClassNotFoundException e) {
            System.out.println("There is no such class (or add packages to the name)");
        }
    }
}
