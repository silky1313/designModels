package io.silky;

import javax.naming.ldap.Rdn;
import java.util.Random;

public class Utils {

    private static final Random RANDOM = new Random();

    public static Boolean getRandomBoolean() {
        return RANDOM.nextBoolean();
    }

    public static Integer getRandomInteger(int r) {
        return RANDOM.nextInt(r);
    }
}
