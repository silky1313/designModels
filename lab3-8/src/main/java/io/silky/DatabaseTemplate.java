package io.silky;

public abstract class DatabaseTemplate {
    public final void templateMethod() {
        connDB();
        openDB();
        useDB();
        closeDB();
    }

    public abstract void connDB();

    public void openDB() {
        System.out.println("Opening database connection");
    }

    public void useDB() {
        System.out.println("Using the database");
    }

    public void closeDB() {
        System.out.println("Closing database connection");
    }
}
