import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    private JPanel JavaCalculator;
    private JTextField textField1;
    private JButton btnx2;
    private JButton btnplus;
    private JButton btnsqrt;
    private JButton btne;
    private JButton btn7;
    private JButton btn4;
    private JButton btnlog10;
    private JButton btn8;
    private JButton btn2;
    private JButton btncos;
    private JButton btn9;
    private JButton btn3;
    private JButton btnsin;
    private JButton btnminus;
    private JButton btn3sqrt;
    private JButton btn1;
    private JButton btn5;
    private JButton btn6;
    private JButton btndivide;
    private JButton btnmulti;
    private JButton btncomma;
    private JButton btn0;
    private JButton btnclear;
    private JButton btnequal;

    private void getoperator (String btnText) {
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

    public JavaCalculator() {
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt0Text = textField1.getText() + btn0.getText();
                textField1.setText(bt0Text);
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt1Text = textField1.getText() + btn1.getText();
                textField1.setText(bt1Text);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt2Text = textField1.getText() + btn2.getText();
                textField1.setText(bt2Text);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt3Text = textField1.getText() + btn3.getText();
                textField1.setText(bt3Text);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt4Text = textField1.getText() + btn4.getText();
                textField1.setText(bt4Text);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt5Text = textField1.getText() + btn5.getText();
                textField1.setText(bt5Text);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt6Text = textField1.getText() + btn6.getText();
                textField1.setText(bt6Text);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt7Text = textField1.getText() + btn7.getText();
                textField1.setText(bt7Text);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt8Text = textField1.getText() + btn8.getText();
                textField1.setText(bt8Text);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt9Text = textField1.getText() + btn9.getText();
                textField1.setText(bt9Text);
            }
        });
        btnplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn_Text = btnplus.getText();
                getoperator(btn_Text);
            }
        });
        btnequal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(math_operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textField1.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textField1.getText());
                        break;
                    case '/':
                        total2 = total1 / (Double.parseDouble(textField1.getText()));
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textField1.getText());
                        break;
                }
                textField1.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textField1.setText("");
            }
        });
        btncomma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("")) {
                    textField1.setText("0.");
                } else if (textField1.getText().contains(".")) {
                    btncomma.setEnabled(false);
                } else {
                    String btncommaText = textField1.getText() + btncomma.getText();
                    textField1.setText(btncommaText);
                }
                btncomma.setEnabled(true);
            }
        });
        btnminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn_Text = btnminus.getText();
                getoperator(btn_Text);
            }
        });

        btndivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn_Text = btndivide.getText();
                getoperator(btn_Text);
            }
        });
        btnmulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn_Text = btnmulti.getText();
                getoperator(btn_Text);
            }
        });

        btnsqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Math.sqrt(Double.parseDouble(textField1.getText()));
                textField1.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Math.exp(Double.parseDouble(textField1.getText()));
                textField1.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnlog10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Math.log10(Double.parseDouble(textField1.getText()));
                textField1.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnsin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Math.sin(Double.parseDouble(textField1.getText()));
                textField1.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btncos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Math.cos(Double.parseDouble(textField1.getText()));
                textField1.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnx2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Math.pow(Double.parseDouble(textField1.getText()),2);
                textField1.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btn3sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Math.pow(Double.parseDouble(textField1.getText()),1/3);
                textField1.setText(Double.toString(total2));
                total1 = 0;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
