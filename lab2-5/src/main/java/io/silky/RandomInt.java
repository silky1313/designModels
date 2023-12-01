package io.silky;

import java.util.Random;

public class RandomInt {
    public static boolean success() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
