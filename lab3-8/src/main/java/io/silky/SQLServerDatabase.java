package io.silky;

public class SQLServerDatabase extends DatabaseTemplate {
    @Override
    public void connDB() {
        System.out.println("Connecting to SQL Server database");
    }
}

