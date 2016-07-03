package com.theironyard;

import org.junit.Test;

import static org.junit.Assert.*;


public class CharacterTest {
    @Test
    public void battle() throws Exception {
        Player player = new Player();
        player.name = "Test Player";
        Enemy enemy = new Enemy("test enemy", 5, 5);
        player.battle(enemy);
        assertTrue(player.health > 0);
        assertTrue(enemy.health <= 0);

    }
}