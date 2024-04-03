package simbanca;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        System.out.println("Avvio sistema");
        SchermataHome frm = new SchermataHome("SimBanca");
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new BorderLayout());
        frm.setSize(400, 400);
    }
}