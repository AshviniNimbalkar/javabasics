package com.in28minutes.oops.level2.interfaces;

public class ChessGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Move piece up");
    }

    @Override
    public void down() {
        System.out.println("Move piece down");
    }

    @Override
    public void left() {

    }

    @Override
    public void right() {

    }
}
