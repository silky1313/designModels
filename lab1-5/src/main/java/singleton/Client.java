package singleton;

public class Client {
    public static void main(String[] args) {
        Window windowFirst = Window.getInstance();;
        windowFirst.setVisible(true);
    }
}