package com.theironyard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	    System.out.println("Welcome Traveler!");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in); //read from standard imput

        String name = scanner.nextLine(); //Freezes program until user hits Enter
        System.out.println("welcome, " + name);

        System.out.println("Choose your weapon (Sword/Mace)");
        String weapon = scanner.nextLine();

        if (weapon.equalsIgnoreCase("Sword")) {
            System.out.println("Sword is a fine choice");

        }
        else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("Mace is a fine choice");
        }
        else {
            throw new Exception("Invalid Weapon"); //alt enter for exceptions


        }

        System.out.println("Choose your Location [Forest/Tunnel]");
        String location = scanner.nextLine();

        if (location.equalsIgnoreCase("Forest")) {
            System.out.println("Entering Forest");
        }

        else if (location.equalsIgnoreCase("tunnel")) {
            System.out.println("Entering Tunnel");

        }
        else {
            throw new Exception("Invalid Location");
        }
    }

}
