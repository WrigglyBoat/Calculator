import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorFrame extends JFrame implements ActionListener{
    JTextField fieldOne, fieldTwo, equalField;
    JLabel operatorLabel, equalLabel;
    JCheckBox oneCheckBox, twoCheckBox;
    JButton one,two,three,four,five,six,seven,eight,nine,zero;
    JButton addBut, minusBut, multiBut, diviBut;
    JButton clearBut, enterBut;
    JPanel decorPanel;

    CalculatorFrame() {
        this.setSize(500,700);
        this.setResizable(false);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        decorPanel = new JPanel();
            decorPanel.setSize(50,700);
            decorPanel.setBackground(Color.CYAN);

        // Creating the Textfields and CheckBoxes right next to each other
        fieldOne = new JTextField();
            fieldOne.setBounds(100,100,75,30);
        oneCheckBox = new JCheckBox();
            oneCheckBox.setBounds(75,100,30,30);

        fieldTwo = new JTextField();
            fieldTwo.setBounds(275,100,75,30);
        twoCheckBox = new JCheckBox();
            twoCheckBox.setBounds(250,100,30,30);

        one = new JButton("1");
            one.setBounds(100,200,50,60);
        
        two = new JButton("2");
            two.setBounds(175,200,50,60);
        
        three = new JButton("3");
            three.setBounds(250,200,50,60);


        this.add(decorPanel);
        this.add(fieldOne);
        this.add(oneCheckBox);
        this.add(fieldTwo);
        this.add(twoCheckBox);
        this.add(one);
        this.add(two);
        this.add(three);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
