package io.silky;

public class OracleDatabase extends DatabaseTemplate {
    @Override
    public void connDB() {
        System.out.println("Connecting to Oracle database");
    }
}
