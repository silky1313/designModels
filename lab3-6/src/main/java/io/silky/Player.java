package io.silky;

public class Player {
    private State state;
    private Integer value = 0;
    Player() {
        state = new PrimaryState();
        value = 0;
    }
    public void play() {
        value += state.play();
        changeState();
    }
    public Integer doubleScore(Integer value) {
        return state.doubleScore(value);
    }
    public void changeCards() {
        state.changeCards();
    }
    public void peekCards() {
        state.changeCards();
    }
    public void changeState() {
        if (value <= 10) {
            state = new PrimaryState();
        } else if (value <= 20) {
            state = new SecondaryState();
        } else if (value <= 30) {
            state = new ProfessionalState();
        } else if (value <= 40) {
            state = new FinalState();
        }
    }

}
