package singleton;

import singleton.ChildWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private static Window instance;
    private String value;

    private Window() {
        this.value = value;
        setTitle("Main Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JButton createChildWindowButton = new JButton("Create Child Window");
        createChildWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChildWindow.getInstance().setVisible(true);
            }
        });

        JPanel panel = new JPanel();
        panel.add(createChildWindowButton);
        add(panel, BorderLayout.CENTER);
    }

    public static Window getInstance() {
        if (instance == null) {
            instance = new Window();
        }
        return instance;
    }
}
