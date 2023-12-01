package io.silky;

import java.util.Random;

public class PrimaryState extends State{
    @Override
    public Integer play() {
        System.out.println("i will play with you");
        Boolean success = Utils.getRandomBoolean();
        return success ? 1 : 0;
    }

    @Override
    public Integer doubleScore(Integer value) {
        System.out.println("sorry, i'm");
    }

    @Override
    public void changeCards() {

    }

    @Override
    public void peekCards() {

    }
}
