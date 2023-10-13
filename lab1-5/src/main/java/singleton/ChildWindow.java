package singleton;

import javax.swing.*;

public class ChildWindow extends JFrame {
    private static ChildWindow instance;

    private ChildWindow() {
        setTitle("Child Window");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(200, 150);
        setLocationRelativeTo(null);
    }

    public static ChildWindow getInstance() {
        if (instance == null) {
            instance = new ChildWindow();
        }
        return instance;
    }
}
