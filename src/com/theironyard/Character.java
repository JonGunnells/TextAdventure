package com.theironyard;


public class Character {
    String name;
    int health;
    int damage;

    public void battle(Character enemy) {
        System.out.printf("A wild %s appeared\n", enemy.name);

        while (this.health > 0 && enemy.health >0) {
            this.health -= enemy.damage;
            enemy.health -= this.damage;
            System.out.printf("%s's health: %s\n", this.name, this.health);
            System.out.printf("%s's health: %s\n", this.name, this.health);

        }

        if (this.health <=0) {
            System.out.println("You have died.");
        }

        if (enemy.health <=0) {
            System.out.printf("% has died.\n", enemy.name);
        }
    }

    @Override
    public String toString() {
        return "Character{" + "name='" + name + '\'' + ", health=" + health + ", damage=" + damage + '}';
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
