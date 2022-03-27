package com.company;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DarkLightTheme extends JFrame{
    //JFrame components declarations start here  :
    JLabel text = new JLabel();
    JButton lightMode = new JButton();
    JButton darkMode= new JButton();

    //Create Constructor :
    DarkLightTheme(){
        ///Add light Mode Button in JFrame
        lightMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        lightMode.setBorder(null);
        lightMode.setVisible(false);
        lightMode.setBounds(600,20,70,45);
        add(lightMode);
        ImageIcon dark = new ImageIcon("D:\\lightMode.jpg");
        Image img = dark.getImage();
        Image imageScale = img.getScaledInstance(lightMode.getWidth(),lightMode.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaleImg = new ImageIcon(imageScale);
        lightMode.setIcon(scaleImg);


        ///Add dark Mode Button in JFrame
        darkMode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        darkMode.setBorder(null);
        darkMode.setBounds(600,20,70,45);
        add(darkMode);
        ImageIcon light = new ImageIcon("D:\\darkMode.jpg");
        Image img1 = light.getImage();
        Image imageScale1 = img1.getScaledInstance(darkMode.getWidth(),darkMode.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon scaleImg1 = new ImageIcon(imageScale1);
        darkMode.setIcon(scaleImg1);

        //Light mode button addActionListener
        lightMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lightMode.setVisible(false);
                darkMode.setVisible(true);
                getContentPane().setBackground(Color.WHITE);
                text.setForeground(Color.BLACK);
                text.setText("Light mode enabled");
            }
        });
        //Dark mode button addActionListener
        darkMode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                darkMode.setVisible(false);
                lightMode.setVisible(true);
                getContentPane().setBackground(Color.BLACK);
                text.setForeground(Color.WHITE);
                text.setText("Dark mode enabled");
            }
        });


        //add text in JFrame
        text.setFont(new Font("Corbel", 1, 18));
        text.setText("Create Dark & Light Theme Funcationality in Java Swing Application");
        add(text);
        text.setBounds(20, 182, 550, 23);

        //Define Some JFrame Properties :
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Dark & Light Theme");
        setLocation(450, 200);
        setResizable(false);
        setSize(700, 500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);


    }
    //Main method start here
    public static void main(String[] args) {
        new DarkLightTheme();
    }
}
