package io.silky;

public class Main {
    public static void main(String[] args) {
        DatabaseTemplate od1 = new OracleDatabase();
        DatabaseTemplate od2 = new SQLServerDatabase();

        od1.templateMethod();

        od2.templateMethod();
    }
}