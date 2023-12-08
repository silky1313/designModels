package io.silky;

public class FinalState extends State {
    @Override
    public Integer play() {
        System.out.println("i will play with you");
        Boolean success = Utils.getRandomBoolean();
        return success ? 1 : 0;
    }

    @Override
    public Integer doubleScore(Integer value) {
        return value * 2;
    }

    @Override
    public void changeCards() {
        System.out.println("change card success");
    }

    @Override
    public void peekCards() {
        System.out.println("peelCards success");
    }
}
