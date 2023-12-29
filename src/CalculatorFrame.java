import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Timer;
import java.util.TimerTask;

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
    Font fieldFont = new Font("Impact", Font.BOLD,20);
    Color decorColor = new Color(119,136,153);
    Timer numTimer = new Timer();
    int counter;

    CalculatorFrame() {
        this.setSize(500,700);
        this.setResizable(false);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(105,105,105));;
    
        decorPanel = new JPanel();
            decorPanel.setSize(40,700);
            decorPanel.setBackground(decorColor);
        
        decorPanel2 = new JPanel();
            decorPanel2.setBounds(0,625,500,40);
            decorPanel2.setBackground(decorColor);
            
        // Creating the Textfields and CheckBoxes right next to each other
        fieldOne = new JTextField();
            fieldOne.setBounds(75,100,70,30);
            fieldOne.setFont(fieldFont);
        oneCheckBox = new JCheckBox();
            oneCheckBox.setBounds(50,100,25,30);
            oneCheckBox.setSelected(true);

        fieldTwo = new JTextField();
            fieldTwo.setBounds(225,100,70,30);
            fieldTwo.setFont(fieldFont);
        twoCheckBox = new JCheckBox();
            twoCheckBox.setBounds(200,100,25,30);

        equalField = new JTextField();
            equalField.setBounds(350,100,70,30);
            equalField.setFont(fieldFont);

        
        //Number Buttons
        one = new JButton("1");
            one.setBounds(100,200,50,60);
            int oneText = Integer.parseInt(one.getText());
            one.setFont(numFont);
            one.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    one.setEnabled(false);
                    numTimer.schedule(new TimerTask() {    //for simpler number iterating 
                        @Override
                        public void run() {
                            one.setEnabled(true);
                        }
                    }, 100);
                    
                    if(!one.isEnabled()) {
                        counter = oneText;
                        buttontoTextfield(counter);
                    }
                }
            });
            
        two = new JButton("2");
            two.setBounds(175,200,50,60);
            int twoText = Integer.parseInt(two.getText());
            two.setFont(numFont);
            two.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    two.setEnabled(false);
                    numTimer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            two.setEnabled(true);
                        }
                    },100);

                    if(!two.isEnabled()) {
                        counter = twoText;
                        buttontoTextfield(counter);
                    }
                }
            });
        
        three = new JButton("3");
            three.setBounds(250,200,50,60);
            int threeText = Integer.parseInt(three.getText());
            three.setFont(numFont);
            three.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    three.setEnabled(false);
                    numTimer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            three.setEnabled(true);
                        }
                    }, 100);

                    if(!three.isEnabled()) {
                        counter = threeText;
                        buttontoTextfield(counter);
                    }
                }
                
            });

        four = new JButton("4");
            four.setBounds(100,300,50,60);
            int fourText = Integer.parseInt(four.getText());
            four.setFont(numFont);
            four.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    four.setEnabled(false);
                    numTimer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            four.setEnabled(true);
                        }
                    }, 100);

                    if(!four.isEnabled()) {
                        counter = fourText;
                        buttontoTextfield(counter);
                    }
                }
            });
        
        five = new JButton("5");
            five.setBounds(175,300,50,60);
            int fiveText = Integer.parseInt(five.getText());
            five.setFont(numFont);
            five.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    five.setEnabled(false);
                    numTimer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            five.setEnabled(true);
                        }
                    }, 100);

                    if(!five.isEnabled()) {
                        counter = fiveText;
                        buttontoTextfield(counter);
                    }
                }
            });
        
        six = new JButton("6");
            six.setBounds(250,300,50,60);
            int sixText = Integer.parseInt(six.getText());
            six.setFont(numFont);
            six.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    six.setEnabled(false);
                    numTimer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            six.setEnabled(true);
                        }
                    }, 100);
                    if(!six.isEnabled()) {
                        counter = sixText;
                        buttontoTextfield(counter);
                    }
                }
            });
        
        seven = new JButton("7");
            seven.setBounds(100,400,50,60);
            int sevenText = Integer.parseInt(seven.getText());
            seven.setFont(numFont);
            seven.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    seven.setEnabled(false);
                    numTimer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            seven.setEnabled(true);
                        }
                    }, 100);
                    if(!seven.isEnabled()) {
                        counter = sevenText;
                        buttontoTextfield(counter);
                    }
                }
            });
    
        eight = new JButton("8");
            eight.setBounds(175,400,50,60);
            int eightText = Integer.parseInt(eight.getText());
            eight.setFont(numFont);
            eight.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    eight.setEnabled(false);
                    numTimer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            eight.setEnabled(true);
                        }
                        
                    }, 100);

                    if(!eight.isEnabled()) {
                        counter = eightText;
                        buttontoTextfield(counter);
                    }
                }
            });
        
        nine = new JButton("9");
            nine.setBounds(250,400,50,60);
            int nineText = Integer.parseInt(nine.getText());
            nine.setFont(numFont);
            nine.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    nine.setEnabled(false);
                    numTimer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            nine.setEnabled(true);
                        }
                    }, 100);
                    if(!nine.isEnabled()) {
                        counter = nineText;
                        buttontoTextfield(counter);
                    }
                }
                
            });
        
        zero = new JButton("0");
            zero.setBounds(175,500,50,60);
            int zeroText = Integer.parseInt(zero.getText());
            zero.setFont(numFont);
            zero.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    zero.setEnabled(false);
                    numTimer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            zero.setEnabled(true);
                        }
                        
                    }, 100);
                    if(!zero.isEnabled()) {
                        counter = zeroText;
                        buttontoTextfield(counter);
                    }
                }
                
            });

        //Operator Buttons
        addBut = new JButton("+");
            addBut.setBounds(350,200,50,60);
            addBut.setFont(numFont);

        minusBut = new JButton("-");
            minusBut.setBounds(350,300,50,60);
            minusBut.setFont(numFont);

        multiBut = new JButton("x");
            multiBut.setBounds(350,400,50,60);
            multiBut.setFont(numFont);

        diviBut = new JButton("/");
            diviBut.setBounds(350,500,50,60);
            diviBut.setFont(numFont);
        
        operatorLabel = new JLabel();
            operatorLabel.setBounds(170,100,30,30);
            operatorLabel.setFont(numFont);
            operatorLabel.setVisible(false);

        equalLabel = new JLabel("=");
            equalLabel.setBounds(320,100,30,30);
            equalLabel.setFont(numFont);

        clearBut = new JButton("C");
            clearBut.setBounds(100,500,50,60);
            clearBut.setFont(numFont);

        enterBut = new JButton("E");
            enterBut.setBounds(250,500,50,60);
            enterBut.setFont(numFont);
        
        

        //Operator Button Logic 
        addBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operatorLabel.setText(addBut.getText());
                operatorLabel.setVisible(true);
                addBut.setEnabled(false);
                minusBut.setEnabled(true);
                multiBut.setEnabled(true);
                diviBut.setEnabled(true);
            }
        });

        minusBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operatorLabel.setText(minusBut.getText());
                operatorLabel.setVisible(true);
                addBut.setEnabled(true);
                minusBut.setEnabled(false);
                multiBut.setEnabled(true);
                diviBut.setEnabled(true);
            }
        });
        
        multiBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operatorLabel.setText(multiBut.getText());
                operatorLabel.setVisible(true);
                addBut.setEnabled(true);
                minusBut.setEnabled(true);
                multiBut.setEnabled(false);
                diviBut.setEnabled(true);
            }
        });

        diviBut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operatorLabel.setText(diviBut.getText());
                operatorLabel.setVisible(true);
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
                if(!addBut.isEnabled()) {  //Addition
                    int num = Integer.parseInt(fieldOne.getText());
                    int num2 = Integer.parseInt(fieldTwo.getText());
                    int total = num + num2;
                    String totalString = Integer.toString(total);
                    equalField.setText(totalString);
                }

                if(!minusBut.isEnabled()) { //Subtraction
                    int num = Integer.parseInt(fieldOne.getText());
                    int num1 = Integer.parseInt(fieldTwo.getText());
                    int total = num - num1;
                    String totalString = Integer.toString(total);
                    equalField.setText(totalString);
                }

                if(!multiBut.isEnabled()) { //Multiplication
                    int num = Integer.parseInt(fieldOne.getText());
                    int num1 = Integer.parseInt(fieldTwo.getText());
                    int total = num * num1;
                    String totalString = Integer.toString(total);
                    equalField.setText(totalString);
                }

                if(!diviBut.isEnabled()) { //Division
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

    public void buttontoTextfield(int counter) {
        if(oneCheckBox.isSelected()) {
            fieldOne.setText(fieldOne.getText() + counter);
        } 
                    
        if(twoCheckBox.isSelected()) {
            fieldTwo.setText(fieldTwo.getText() + counter);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}