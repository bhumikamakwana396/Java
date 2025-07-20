package com.gui;

import java.awt.event.*;
import javax.swing.*;


public class LoginForm implements ActionListener
{
	JFrame f1;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	
	public LoginForm()
	{
		f1=new JFrame("Login Form");
		
		f1.setLayout(null);
		f1.setSize(350,200);
		f1.setResizable(false);
		
		l1=new JLabel("Email");
		l1.setBounds(50, 30, 80, 25);
		l2=new JLabel("Password");
		l2.setBounds(50, 70, 80, 25);
		
		t1=new JTextField();
		t1.setBounds(150, 30, 150, 25);
		t2=new JTextField();
		t2.setBounds(150, 70, 150, 25);
		
		b1=new JButton("Login");
		b1.setBounds(50, 110, 100, 30);
		b2=new JButton("Cancel");
		b2.setBounds(200, 110, 100, 30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		f1.add(l1);f1.add(t1);
		f1.add(l2);f1.add(t2);
		f1.add(b1);f1.add(b2);
		
		f1.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new LoginForm();
	}
	
	@Override
	
	public void actionPerformed(ActionEvent e) 
	{
		String user=t1.getText();
		String pass=t2.getText();
		
		if(e.getSource()==b1)
		{
			if(user.isEmpty()||pass.isEmpty())
			{
				JOptionPane.showMessageDialog(f1, "Please enter email and password");
			}
			else if(user.equals("admin") && pass.equals("1234"))
			{
				JOptionPane.showMessageDialog(f1,"Login successfully");
			}
			else
			{
				JOptionPane.showMessageDialog(f1,"Invalid email id and password");
			}
		}
		else if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
		}
	}
}
