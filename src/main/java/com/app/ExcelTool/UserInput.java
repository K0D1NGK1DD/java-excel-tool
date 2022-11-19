package com.app.ExcelTool;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserInput extends JPanel implements ActionListener {
	JLabel typeLabel = new JLabel("Card's Type");
	JTextField cardType = new JTextField();
	JLabel frontLabel = new JLabel("Card's Front Side");
	JTextField cardFront = new JTextField();
	JLabel backLabel = new JLabel("Card's Back Side");
	JTextField cardBack = new JTextField();
	JPanel cardPanel = new JPanel(new GridLayout(4,2));
	JPanel panel = new JPanel();
	JButton submit = new JButton("Submit");
	JButton clear = new JButton("Clear");
	CardLayout cl;
	UserInput() {
		setLayout(new CardLayout());
		cardPanel.add(typeLabel);
		cardPanel.add(cardType);
		cardPanel.add(frontLabel);
		cardPanel.add(cardFront);
		cardPanel.add(backLabel);
		cardPanel.add(cardBack);
		submit.addActionListener(this);
		clear.addActionListener(this);
		cardPanel.add(submit);
		cardPanel.add(clear);
		panel.add(cardPanel);
		add(panel, "submit");
		cl = (CardLayout) getLayout();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("User Input Form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		UserInput input = new UserInput();
		frame.add(input);
		frame.setVisible(true);
		
	}

}
