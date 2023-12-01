package io.silky;

public class Main {
    public static void main(String[] args) {
        OpenButton ob = new OpenButton();
        int i = 0;
        while(true) {
            System.out.println("Try booting for the " + i + " time");
            boolean success = ob.openComputer();
            if(success){
                System.out.println("Compute boot success");
                break;
            }
            i++;
        }
    }
}