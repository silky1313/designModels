package extendsingleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Window extends JFrame {
    private static ArrayList<ChildWindow> childWindows = new ArrayList<>();
    private static Window instance;
    private static int childWindowCount = 0;

    private Window() {
        setTitle("Main Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JButton createChildWindowButton = new JButton("Create Child Window");
        createChildWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (childWindowCount < 3) {
                    ChildWindow childWindow = new ChildWindow();
                    childWindows.add(childWindow);
                    childWindowCount++;
                    childWindow.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Maximum number of child windows reached (3).");
                }
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

    private static void releaseChildWindow(ChildWindow childWindow) {
        childWindows.remove(childWindow);
        childWindowCount--;
    }

    private class ChildWindow extends JFrame {
        public ChildWindow() {
            setTitle("Child Window");
            setSize(200, 150);
            setLocationRelativeTo(null);

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    releaseChildWindow((ChildWindow) e.getWindow());
                }
            });
        }
    }
}