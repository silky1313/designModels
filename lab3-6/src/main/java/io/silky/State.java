package io.silky;

public abstract class State {
    public abstract Integer play();
    public abstract Integer doubleScore(Integer value);
    public abstract void changeCards();
    public abstract void peekCards();
}
