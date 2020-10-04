package com.codebin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginTest {
    private JButton buttonmsg;
    private JPanel panelMain;

    public LoginTest() {
        buttonmsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Hello World");

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LoginTest");
        frame.setContentPane(new LoginTest().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
