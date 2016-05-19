package com.theironyard;

import java.util.ArrayList;

/**
 * Created by jonathangunnells on 5/18/16.
 */
public class Player {
    String name;
    String weapon;
    String location;
    ArrayList<String> items = new ArrayList<>();


    public void chooseName() {
        System.out.println("What is your name?");
        name = Main.scanner.nextLine(); //Freezes program until user hits Enter
        System.out.println("welcome, " + name);
    }

    public void chooseWeapon() throws Exception {
        System.out.println("Choose your weapon (Sword/Mace)");
        weapon = Main.scanner.nextLine();

        if (weapon.equalsIgnoreCase("Sword")) {
            System.out.println("Sword is a fine choice");

        } else if (weapon.equalsIgnoreCase("mace")) {
            System.out.println("Mace is a fine choice");
        } else {
            throw new Exception("Invalid Weapon"); //alt enter for exceptions
        }

    }

    public void chooseLocation() throws Exception {

        System.out.println("Choose your Location [Forest/Tunnel]");
        location = Main.scanner.nextLine();

        if(location.equalsIgnoreCase("Forest"))

        {
            System.out.println("Entering The Forest...");
        }

        else if(location.equalsIgnoreCase("tunnel"))

        {
            System.out.println("Entering The Tunnel...");

        }

        else

        {
            throw new Exception("Invalid Location");
        }
    }

    public void findItem(String item) {
        System.out.println(" You Found " + item + " Pick it up? [Y/N] ");
        String answer = Main.scanner.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            items.add(item);
            System.out.println(" You now have " + items.size() + " items ");

        }
    }
}
