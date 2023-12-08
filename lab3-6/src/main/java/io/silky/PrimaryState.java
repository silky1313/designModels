package io.silky;


public class PrimaryState extends State {
    @Override
    public Integer play() {
        System.out.println("i will play with you");
        Boolean success = Utils.getRandomBoolean();
        return success ? 1 : 0;
    }

    @Override
    public Integer doubleScore(Integer value) {
        System.out.println("sorry, i can't supply this function");
        return 0;
    }

    @Override
    public void changeCards() {
        System.out.println("sorry, i can't supply this function");
    }

    @Override
    public void peekCards() {
        System.out.println("sorry, i can't supply this function");
    }
}
