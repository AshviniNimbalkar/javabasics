package com.in28minutes.oops.level2.interfaces;

public class GamingRunner {
    public static void main(String[]args){
        GamingConsole game = new MarioGame();
        game.down();
        game.up();
        game.left();
        game.right();
    }
}
