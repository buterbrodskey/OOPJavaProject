package com.mypackage.exercise_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class EditorChoiseFIleGUI {
    EditorChoiseFIleGUI(EditorGUI editorGUI) {

        JFrame frame = new JFrame("Выберите формат файла");
        frame.setSize(350, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout());



        JTextField textField = new JTextField(24);



        JButton OkButton = new JButton("Ok");
        JButton CancelButton = new JButton("Cancel");

        DocumentType[] items = DocumentType.values();
        JComboBox comboBox = new JComboBox(items);

        OkButton.addActionListener(e -> {
            if (comboBox.getSelectedItem().equals("TextDocument")) {
                System.out.println();
            }
            else if (comboBox.getSelectedItem().equals("ImageDocument")) {

            }

            editorGUI.addFile((DocumentType) comboBox.getSelectedItem(), textField.getText());
            frame.setVisible(false);
            frame.dispose();
        });

        CancelButton.addActionListener(e -> {
            frame.setVisible(false);
            frame.dispose();
        });

        jPanel.add(textField);

        jPanel.add(comboBox);

        jPanel.add(OkButton);

        jPanel.add(CancelButton);


        frame.getContentPane().add(jPanel);
    }
}
