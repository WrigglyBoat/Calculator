import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

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
    JPanel decorPanel, decorPanel2;
    Font numFont = new Font("Comic Sans",Font.BOLD,15);
    int counter = 0;

    CalculatorFrame() {
        this.setSize(500,700);
        this.setResizable(false);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(105,105,105));;
    
        decorPanel = new JPanel();
            decorPanel.setSize(40,700);
            decorPanel.setBackground(new Color(119,136,153));
        
        decorPanel2 = new JPanel();
            decorPanel2.setBounds(0,625,500,40);
            decorPanel2.setBackground(new Color(119,136,153));
            
        // Creating the Textfields and CheckBoxes right next to each other
        fieldOne = new JTextField();
            fieldOne.setBounds(75,100,70,30);
        oneCheckBox = new JCheckBox();
            oneCheckBox.setBounds(50,100,25,30);
            oneCheckBox.setSelected(true);

        fieldTwo = new JTextField();
            fieldTwo.setBounds(225,100,70,30);
        twoCheckBox = new JCheckBox();
            twoCheckBox.setBounds(200,100,25,30);

        equalField = new JTextField();
            equalField.setBounds(350,100,70,30);

        
        
        //Number Buttons
        one = new JButton("1");
            one.setBounds(100,200,50,60);
            one.setFont(numFont);
            one.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(oneCheckBox.isSelected()) {
                        fieldOne.setText(fieldOne.getText() + 1);
                    } 
                    
                    if(twoCheckBox.isSelected()) {
                        fieldTwo.setText(fieldTwo.getText() + 1);
                    }
                }
                
            });
        
        two = new JButton("2");
            two.setBounds(175,200,50,60);
            two.setFont(numFont);
            two.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(oneCheckBox.isSelected()) {
                        fieldOne.setText(fieldOne.getText() + 2);
                    } 
                    
                    if(twoCheckBox.isSelected()) {
                        fieldTwo.setText(fieldTwo.getText() + 2);
                    }
                }
                
            });
        
        three = new JButton("3");
            three.setBounds(250,200,50,60);
            three.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(oneCheckBox.isSelected()) {
                        fieldOne.setText(fieldOne.getText() + 3);
                    } 
                    
                    if(twoCheckBox.isSelected()) {
                        fieldTwo.setText(fieldTwo.getText() + 3);
                    }
                }
                
            });

        four = new JButton("4");
            four.setBounds(100,300,50,60);
            four.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(oneCheckBox.isSelected()) {
                        fieldOne.setText(fieldOne.getText() + 4);
                    } 
                    
                    if(twoCheckBox.isSelected()) {
                        fieldTwo.setText(fieldTwo.getText() + 4);
                    }
                }
                
            });
        
        five = new JButton("5");
            five.setBounds(175,300,50,60);
            five.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(oneCheckBox.isSelected()) {
                        fieldOne.setText(fieldOne.getText() + 5);
                    } 
                    
                    if(twoCheckBox.isSelected()) {
                        fieldTwo.setText(fieldTwo.getText() + 5);
                    }
                }
                
            });
        
        six = new JButton("6");
            six.setBounds(250,300,50,60);
            six.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(oneCheckBox.isSelected()) {
                        fieldOne.setText(fieldOne.getText() + 6);
                    } 
                    
                    if(twoCheckBox.isSelected()) {
                        fieldTwo.setText(fieldTwo.getText() + 6);
                    }
                }
                
            });
        
        seven = new JButton("7");
            seven.setBounds(100,400,50,60);
            seven.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(oneCheckBox.isSelected()) {
                        fieldOne.setText(fieldOne.getText() + 7);
                    } 
                    
                    if(twoCheckBox.isSelected()) {
                        fieldTwo.setText(fieldTwo.getText() + 7);
                    }
                }
                
            });
    
        eight = new JButton("8");
            eight.setBounds(175,400,50,60);
            eight.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(oneCheckBox.isSelected()) {
                        fieldOne.setText(fieldOne.getText() + 8);
                    } 
                    
                    if(twoCheckBox.isSelected()) {
                        fieldTwo.setText(fieldTwo.getText() + 8);
                    }
                }
                
            });
        
        nine = new JButton("9");
            nine.setBounds(250,400,50,60);
            nine.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(oneCheckBox.isSelected()) {
                        fieldOne.setText(fieldOne.getText() + 9);
                    } 
                    
                    if(twoCheckBox.isSelected()) {
                        fieldTwo.setText(fieldTwo.getText() + 9);
                    }
                }
                
            });
        
        zero = new JButton("0");
            zero.setBounds(175,500,50,60);
            zero.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(oneCheckBox.isSelected()) {
                        fieldOne.setText(fieldOne.getText() + 0);
                    } 
                    
                    if(twoCheckBox.isSelected()) {
                        fieldTwo.setText(fieldTwo.getText() + 0);
                    }
                }
                
            });


        //Operator Buttons
        addBut = new JButton("+");
            addBut.setBounds(350,200,50,60);

        minusBut = new JButton("-");
            minusBut.setBounds(350,300,50,60);

        multiBut = new JButton("x");
            multiBut.setBounds(350,400,50,60);

        diviBut = new JButton("/");
            diviBut.setBounds(350,500,50,60);
        
        operatorLabel = new JLabel("_");
            operatorLabel.setBounds(175,100,30,30);
            operatorLabel.setFont(new Font("Comic Sans", Font.PLAIN , 15));

        equalLabel = new JLabel("=");
            equalLabel.setBounds(320,100,30,30);
            equalLabel.setFont(new Font("Comic Sans", Font.BOLD, 15));

        clearBut = new JButton("C");
            clearBut.setBounds(100,500,50,60);

        enterBut = new JButton("E");
            enterBut.setBounds(250,500,50,60);
        
        

        //Operator Button Logic 
        addBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operatorLabel.setText(addBut.getText());
                addBut.setEnabled(false);
                minusBut.setEnabled(true);
                multiBut.setEnabled(true);
                diviBut.setEnabled(true);
            }
        });

        minusBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operatorLabel.setText(minusBut.getText());
                addBut.setEnabled(true);
                minusBut.setEnabled(false);
                multiBut.setEnabled(true);
                diviBut.setEnabled(true);
            }
        });
        
        multiBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operatorLabel.setText(multiBut.getText());
                addBut.setEnabled(true);
                minusBut.setEnabled(true);
                multiBut.setEnabled(false);
                diviBut.setEnabled(true);
            }
        });

        diviBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operatorLabel.setText(diviBut.getText());
                addBut.setEnabled(true);
                minusBut.setEnabled(true);
                multiBut.setEnabled(true);
                diviBut.setEnabled(false);
            }
        });

        clearBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldOne.setText(" ");
                fieldTwo.setText(" ");
                equalField.setText(" ");
            }
            
        });

        //Enter button holds most important logic
        enterBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!addBut.isEnabled()) {
                    int num = Integer.parseInt(fieldOne.getText());
                    int num2 = Integer.parseInt(fieldTwo.getText());
                    int total = num + num2;
                    String totalString = Integer.toString(total);
                    equalField.setText(totalString);
                }

                if(!minusBut.isEnabled()) {
                    int num = Integer.parseInt(fieldOne.getText());
                    int num1 = Integer.parseInt(fieldTwo.getText());
                    int total = num - num1;
                    String totalString = Integer.toString(total);
                    equalField.setText(totalString);
                }

                if(!multiBut.isEnabled()) {
                    int num = Integer.parseInt(fieldOne.getText());
                    int num1 = Integer.parseInt(fieldTwo.getText());
                    int total = num * num1;
                    String totalString = Integer.toString(total);
                    equalField.setText(totalString);
                }

                if(!diviBut.isEnabled()) {
                    if(fieldOne.getText() == "0") {
                        equalField.setText("CANNOT DIVIDE BY 2");
                        return;
                    }
                    int num = Integer.parseInt(fieldOne.getText());
                    int num1 = Integer.parseInt(fieldTwo.getText());
                    
                    int total = num / num1;
                    String totalString = Integer.toString(total);
                    equalField.setText(totalString);
                }
            }
            
        });


        this.add(decorPanel);
        this.add(decorPanel2);
        this.add(fieldOne);
        this.add(oneCheckBox);
        this.add(fieldTwo);
        this.add(twoCheckBox);
        this.add(equalField);
        this.add(one);
        this.add(two);
        this.add(three);
        this.add(four);
        this.add(five);
        this.add(six);
        this.add(seven);
        this.add(eight);
        this.add(nine);
        this.add(zero);
        this.add(addBut); 
        this.add(minusBut);
        this.add(multiBut);
        this.add(diviBut);
        this.add(operatorLabel);
        this.add(equalLabel);
        this.add(clearBut);
        this.add(enterBut);
        //this.setVisible(true); moved to main

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}