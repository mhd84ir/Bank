import org.w3c.dom.events.Event;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Bank");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1440,720);
        JPanel languagePanel = new JPanel();
        languagePanel.setBackground(Color.GRAY);
        frame.add(languagePanel);



        languagePanel.setLayout(null);
        JButton englishButton = new JButton("English");
        JButton persianButton = new JButton("فارسی");

        englishButton.setBounds(0,340,140,40);
        persianButton.setBounds(1300,340,140,40);

        languagePanel.add(englishButton);   languagePanel.add(persianButton);

        persianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel passPanel = new JPanel();
                passPanel.setBackground(Color.GRAY);
                frame.remove(languagePanel);
                frame.add(passPanel);
                passPanel.setLayout(null);


                JLabel passLabel = new JLabel("رمز خود را وارد کنید");
                passLabel.setBounds(700,200,150,20);
                passPanel.add(passLabel);


                JTextField passText = new JTextField();
                passText.setBounds(680,300,150,40);
                passPanel.add(passText);

                JButton passButton = new JButton("ثبت");
                passButton.setBounds(680,570,150,100);
                passPanel.add(passButton);



                frame.revalidate();
                frame.repaint();

                passButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JPanel mainPanel = new JPanel();
                        mainPanel.setBackground(Color.GRAY);
                        frame.remove(passPanel);
                        frame.add(mainPanel);
                        mainPanel.setLayout(null);

                        JButton withdrawalButton = new JButton("برداشت وجه");
                        withdrawalButton.setBounds(15,230,100,50);
                        mainPanel.add(withdrawalButton);

                        withdrawalButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel withdrawalPanel = new JPanel();
                                withdrawalPanel.setBackground(Color.GRAY);
                                frame.remove(mainPanel);
                                frame.add(withdrawalPanel);
                                withdrawalPanel.setLayout(null);

                                JButton b5 = new JButton( "50000");
                                b5.setBounds(15,230,100,50);
                                withdrawalPanel.add(b5);

                                b5.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel successPanel = new JPanel();
                                        successPanel.setBackground(Color.GRAY);
                                        frame.remove(withdrawalPanel);
                                        frame.add(successPanel);
                                        successPanel.setLayout(null);

                                        JLabel successLabel = new JLabel("عملیات با موفقیت انجام شد.");
                                        successLabel.setBounds(700,200,150,20);
                                        successPanel.add(successLabel);

                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                JButton b15 = new JButton("150000");
                                b15.setBounds(15,380,100,50);
                                withdrawalPanel.add(b15);

                                b15.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel successPanel = new JPanel();
                                        successPanel.setBackground(Color.GRAY);
                                        frame.remove(withdrawalPanel);
                                        frame.add(successPanel);
                                        successPanel.setLayout(null);

                                        JLabel successLabel = new JLabel("عملیات با موفقیت انجام شد.");
                                        successLabel.setBounds(700,200,150,20);
                                        successPanel.add(successLabel);

                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                JButton b100 = new JButton("100000000");
                                b100.setBounds(1325,230,100,50);
                                withdrawalPanel.add(b100);

                                b100.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel successPanel = new JPanel();
                                        successPanel.setBackground(Color.GRAY);
                                        frame.remove(withdrawalPanel);
                                        frame.add(successPanel);
                                        successPanel.setLayout(null);

                                        JLabel successLabel = new JLabel("عملیات با موفقیت انجام شد.");
                                        successLabel.setBounds(700,200,150,20);
                                        successPanel.add(successLabel);

                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                JButton b150 = new JButton("150000000");
                                b150.setBounds(1325,380,100,50);
                                withdrawalPanel.add(b150);

                                b150.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel successPanel = new JPanel();
                                        successPanel.setBackground(Color.GRAY);
                                        frame.remove(withdrawalPanel);
                                        frame.add(successPanel);
                                        successPanel.setLayout(null);

                                        JLabel successLabel = new JLabel("عملیات با موفقیت انجام شد.");
                                        successLabel.setBounds(700,200,150,20);
                                        successPanel.add(successLabel);

                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });



                                frame.revalidate();
                                frame.repaint();
                            }
                        });

                        JButton cardByCardButton = new JButton("کارت به کارت");
                        cardByCardButton.setBounds(15,380,100,50);
                        mainPanel.add(cardByCardButton);

                        cardByCardButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel cardByCardPanel = new JPanel();
                                cardByCardPanel.setBackground(Color.GRAY);
                                frame.remove(mainPanel);
                                frame.add(cardByCardPanel);
                                cardByCardPanel.setLayout(null);

                                JLabel cardLabel = new JLabel("مبلغ مورد نظر را وارد کنید:");
                                cardLabel.setBounds(700,200,150,20);
                                cardByCardPanel.add(cardLabel);


                                JTextField cardText = new JTextField();
                                cardText.setBounds(680,250,150,40);
                                cardByCardPanel.add(cardText);

                                JLabel cardLabel2 = new JLabel("شماره کارت مقصد وارد کنید:");
                                cardLabel2.setBounds(700,300,150,20);
                                cardByCardPanel.add(cardLabel2);


                                JTextField cardText2 = new JTextField();
                                cardText2.setBounds(680,350,150,40);
                                cardByCardPanel.add(cardText2);

                                JButton cardButton = new JButton("ثبت");
                                cardButton.setBounds(680,570,150,100);
                                cardByCardPanel.add(cardButton);


                                cardButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel successPanel = new JPanel();
                                        successPanel.setBackground(Color.GRAY);
                                        frame.remove(cardByCardPanel);
                                        frame.add(successPanel);
                                        successPanel.setLayout(null);

                                        JLabel successLabel = new JLabel("عملیات با موفقیت انجام شد.");
                                        successLabel.setBounds(700,200,150,20);
                                        successPanel.add(successLabel);

                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });

                                frame.revalidate();
                                frame.repaint();

                            }
                        });

                        JButton changePassButton = new JButton("تغییر رمز");
                        changePassButton.setBounds(1325,230,100,50);
                        mainPanel.add(changePassButton);

                        changePassButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel changePassPanel = new JPanel();
                                changePassPanel.setBackground(Color.GRAY);
                                frame.remove(mainPanel);
                                frame.add(changePassPanel);
                                changePassPanel.setLayout(null);


                                JLabel passLabel = new JLabel("رمز جدید را وارد کنید:");
                                passLabel.setBounds(700,200,150,20);
                                changePassPanel.add(passLabel);


                                JTextField passText = new JTextField();
                                passText.setBounds(680,300,150,40);
                                changePassPanel.add(passText);

                                JButton passButton = new JButton("ثبت");
                                passButton.setBounds(680,570,150,100);
                                changePassPanel.add(passButton);

                                passButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        JPanel successPanel = new JPanel();
                                        successPanel.setBackground(Color.GRAY);
                                        frame.remove(changePassPanel);
                                        frame.add(successPanel);
                                        successPanel.setLayout(null);

                                        JLabel successLabel = new JLabel("عملیات با موفقیت انجام شد.");
                                        successLabel.setBounds(700,200,150,20);
                                        successPanel.add(successLabel);

                                        frame.revalidate();
                                        frame.repaint();
                                    }
                                });



                                frame.revalidate();
                                frame.repaint();
                            }
                        });

                        JButton balanceButton = new JButton("اعلام موجودی");
                        balanceButton.setBounds(1325,380,100,50);
                        mainPanel.add(balanceButton);

                        balanceButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JPanel balancePanel = new JPanel();
                                balancePanel.setBackground(Color.GRAY);
                                frame.remove(mainPanel);
                                frame.add(balancePanel);
                                balancePanel.setLayout(null);


                                JLabel balanceLabel = new JLabel("موجودی حساب شما : ۱۴۵۴۶۴۵۳ ریال");
                                balanceLabel.setBounds(700,200,300,20);
                                balancePanel.add(balanceLabel);


                                frame.revalidate();
                                frame.repaint();

                            }
                        });

                        frame.revalidate();
                        frame.repaint();
                    }
                });

                frame.revalidate();
                frame.repaint();

            }
        });


        frame.setVisible(true);

    }
}