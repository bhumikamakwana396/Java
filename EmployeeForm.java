package com.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

public class EmployeeForm implements ActionListener
{
	JFrame f1;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4;
	Connection con;
	ResultSet rs;
	PreparedStatement pst;
	
	public EmployeeForm()
	{
		f1=new JFrame("Employee Form");
		f1.setSize(420,350);
		f1.setResizable(false);
		f1.setLayout(null);
		
		l1=new JLabel("Eid");
		l1.setBounds(50,40,100,25);
		l2=new JLabel("Ename");
		l2.setBounds(50,70,100,25);
		l3=new JLabel("Salary");
		l3.setBounds(50,110,100,25);
		l4=new JLabel("Job");
		l4.setBounds(50,150,100,25);
		l5=new JLabel("Location");
		l5.setBounds(50,190,100,25);
		
		
		t1=new JTextField();
		t1.setBounds(150,30,180,25);
		t2=new JTextField();
		t2.setBounds(150,70,180,25);
		t3=new JTextField();
		t3.setBounds(150,110,180,25);
		t4=new JTextField();
		t4.setBounds(150,150,180,25);
		t5=new JTextField();
		t5.setBounds(150,190,180,25);
		
		
		b1=new JButton("Insert");
		b1.setBounds(30, 230, 80, 30);
		b2=new JButton("Search");
		b2.setBounds(120, 230, 80, 30);
		b3=new JButton("Update");
		b3.setBounds(210, 230, 80, 30);
		b4=new JButton("Delete");
		b4.setBounds(300, 230, 80, 30);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		
		f1.add(l1);f1.add(t1);
		f1.add(l2);f1.add(t2);
		f1.add(l3);f1.add(t3);
		f1.add(l4);f1.add(t4);
		f1.add(l5);f1.add(t5);
		f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);
		
		connect();
		f1.setVisible(true);
	}
		
		void connect()
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_swing_10","root","");
				JOptionPane.showMessageDialog(f1, "Connection success");
				
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(f1, "Connetion Failed");			}
		}
	
	public static void main(String[] args) 
	{
		new EmployeeForm();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
			if(e.getSource()==b1)
			{
				if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")||t4.getText().equals("")||t4.getText().equals("")) 
				{
					JOptionPane.showMessageDialog(f1, "Please fill out all this fill before inserting data");
				}
				try
				{
					pst=con.prepareStatement("insert into employee(eid,ename,salary,job,lovation) values(?,?,?,?,?)");
					pst.setInt(1, Integer.parseInt(t1.getText()));
					pst.setString(2, t2.getText());
					pst.setString(3, t3.getText());
					pst.setString(4,t4.getText());
					pst.setString(5, t5.getText());
					pst.executeQuery();
					JOptionPane.showMessageDialog(f1, "Insertef Recors Success");
				}
				catch (SQLException ex)
				{
					JOptionPane.showMessageDialog(f1, "Error: "+ex.getMessage());
					ex.printStackTrace();
				}
			}
			
			else if(e.getSource()==b2)
			{
				if(t1.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f1, "First Give Id before serach data");
				}
				
				try
				{
					pst=con.prepareStatement("select * from employee where eid=?");
					pst.setInt(1, Integer.parseInt(t1.getText()));
					
					rs=pst.executeQuery();
					if(rs.next())
					{
						t2.setText(rs.getString("ename"));
						t3.setText(rs.getString("salary"));
						t4.setText(rs.getString("job"));
						t5.setText(rs.getString("lovation"));
					}
					else
					{
						JOptionPane.showMessageDialog(f1, "No Data Found this Id","search result",JOptionPane.INFORMATION_MESSAGE);
					}
				}
				catch (SQLException ex)
				{
					JOptionPane.showMessageDialog(f1, "error: "+ex.getMessage());
				}
			}
			
			else if(e.getSource()==b3)
			{
				if(t1.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f1, "please fill out id fill before update records");
				}
				
				try
				{
					pst=con.prepareStatement("update employee set ename=?,salary=?,job=?,lovation=? where eid=?");
					pst.setInt(1, Integer.parseInt(t1.getText()));
					
					pst.setString(1, t2.getText());
					pst.setString(2, t3.getText());
					pst.setString(3, t4.getText());
					pst.setString(4, t5.getText());
					pst.setInt(5, Integer.parseInt(t1.getText()));
					
					int row=pst.executeUpdate();
					if(row>0)
					{
						JOptionPane.showMessageDialog(f1, "Update record success");
						
					}
					else
					{
						JOptionPane.showMessageDialog(f1, "No record fount this id");
						
					}
				}
				catch (SQLException ex)
				{
					JOptionPane.showMessageDialog(f1, "error:"+ex.getMessage());
				}
			}
			
			else if(e.getSource()==b4)
			{
				if(t1.getText().equals(""))
				{
					JOptionPane.showMessageDialog(f1, "please fill out this field before deleted record","delete result",JOptionPane.INFORMATION_MESSAGE);
				}
				try 
				{
					pst=con.prepareStatement("delete from employee where eid=?");
					pst.setInt(1, Integer.parseInt(t1.getText()));
					pst.executeUpdate();
					JOptionPane.showMessageDialog(f1, "Delete record");
				} catch (SQLException ex)
				{
					JOptionPane.showMessageDialog(f1, "error: "+ex.getMessage());
				}
			}
	}
}
