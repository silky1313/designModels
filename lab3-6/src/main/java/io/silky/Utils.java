package io.silky;

import javax.naming.ldap.Rdn;
import java.util.Random;

public class Utils {

    public static Random random = new Random();
    public static Boolean getRandomBoolean() {
        return random.nextBoolean();
    }
}
