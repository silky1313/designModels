package io.silky;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        for (int i = 0; i < 100; i++) {
            int choose = Utils.getRandomInteger(3);
            if (choose == 0) {
                player.play();
            } else if (choose == 1) {
                player.changeCards();
            } else if (choose == 2) {
                player.peekCards();
            }
        }
    }
}