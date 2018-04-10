package com.form;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;

public class Form {
    private JPanel panelmain;
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextArea textArea1;
    private JTextField textField6;
    private JButton clearButton;

    public Form() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textFieldValue = textField1.getText();
                String textFieldValue1 = textField4.getText();
                String textFieldValue2 = textField5.getText();
                String textFieldValue3 = textField3.getText();
                int w=Integer.parseInt(textFieldValue);
                int x=Integer.parseInt(textFieldValue1);
                int y=Integer.parseInt(textFieldValue2);
                int z=Integer.parseInt(textFieldValue3);
                int s=w+x+y+z;
                int p=s/4;
                String su=Integer.toString(s);
                String pe=Integer.toString(p);
                textField2.setText(su);
                textField6.setText(pe);
                textArea1.append("Subject1"+"\t"+textFieldValue+"\n"+"Subject2"+"\t"+textFieldValue1+"\n"+"Subject3"+"\t"+textFieldValue2+"\n"+"Subject4"+"\t"
                        +textFieldValue3+"\n"+"SUM"+"\t"+su+"\n"+"Percentage"+"\t"+pe+"\n"+"\n");



            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                textField5.setText("");
                textField6.setText("");
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setContentPane(new Form().panelmain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
