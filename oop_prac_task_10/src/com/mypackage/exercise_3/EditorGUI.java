package com.mypackage.exercise_3;

import org.w3c.dom.Document;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.ArrayList;

public class EditorGUI {

    JTextArea ViewOperation;
    private FactoryOfFile factory = new FactoryOfFile();
    private ArrayList<IDocument> TempLibraryFile = new ArrayList<>();


    public EditorGUI() {

        JFrame baseFrame = new JFrame("Dominos Editor");

        baseFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        baseFrame.setSize(1200, 600);
        baseFrame.setResizable(false);
        baseFrame.setLocationRelativeTo(null);


        JPanel panel = new JPanel();

        panel.setLayout(new BorderLayout());

        ViewOperation = new JTextArea();
        ViewOperation.setEditable(false);

        panel.add(ViewOperation, BorderLayout.CENTER);

        panel.add(new JLabel("Processing..."), BorderLayout.PAGE_START);



        JMenu baseMenu = new JMenu("File");
        JMenuItem new_item = new JMenuItem("New");
        JMenuItem open_item = new JMenuItem("Open");

        new_item.addActionListener(e -> {
            new EditorChoiseFIleGUI(this);
        });


        open_item.addActionListener(e -> {
            new EditorChoiseFIleGUI(this);
        });


        baseFrame.getContentPane().add(panel);

        {
            baseMenu.add(new_item);
            baseMenu.add(open_item);
            JMenuBar menuBar = new JMenuBar();
            menuBar.add(baseMenu);
            baseFrame.setJMenuBar(menuBar);
            baseFrame.setVisible(true);
        }

    }

    void addFile(DocumentType type, String name) {

        if ("".equals(name)) {
            ViewOperation.append("Файл не создан, т.к. имя не задано\n");
            return;
        }
        for (IDocument i: TempLibraryFile) {
            if (name.equals(i.getName())) {
                ViewOperation.append("Файл " + name + " уже использовался этой программой!");
                return;
            }
        }
            TempLibraryFile.add(createFile(type, name));
            ViewOperation.append("Создан файл " + name + " типа " + type.name() + "\n") ;
    }



    private IDocument createFile(DocumentType type, String name) {
        return factory.CreateNew(type,name);
    }

    private IDocument CreateFile(DocumentType type, String name, int Weight) {
        return factory.CreateOpen(type, name, Weight);
    }

}
