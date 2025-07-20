package com.gui;

import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class SwingDemo implements ActionListener 
{
    JFrame f1;
    JLabel l1, l2, l3, l4;
    JButton b1, b2, b3, b4;
    JTextField t1, t2, t3, t4;
    Connection con;
    PreparedStatement pst;

    // Constructor
    public SwingDemo()
    {
        f1 = new JFrame("Registration Form");
        f1.setSize(420, 350);
        f1.setLayout(null);
        f1.setResizable(false);

        // Labels
        l1 = new JLabel("ID:");
        l1.setBounds(50, 30, 100, 25);
        l2 = new JLabel("First Name:");
        l2.setBounds(50, 70, 100, 25);
        l3 = new JLabel("Last Name:");
        l3.setBounds(50, 110, 100, 25);
        l4 = new JLabel("Mobile:");
        l4.setBounds(50, 150, 100, 25);

        // TextFields
        t1 = new JTextField();
        t1.setBounds(150, 30, 180, 25);
        t2 = new JTextField();
        t2.setBounds(150, 70, 180, 25);
        t3 = new JTextField();
        t3.setBounds(150, 110, 180, 25);
        t4 = new JTextField();
        t4.setBounds(150, 150, 180, 25);

        // Buttons
        b1 = new JButton("Insert");
        b1.setBounds(30, 200, 80, 30);
        b2 = new JButton("Search");
        b2.setBounds(120, 200, 80, 30);
        b3 = new JButton("Update");
        b3.setBounds(210, 200, 80, 30);
        b4 = new JButton("Delete");
        b4.setBounds(300, 200, 80, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        // Add components
        f1.add(l1); f1.add(t1);
        f1.add(l2); f1.add(t2);
        f1.add(l3); f1.add(t3);
        f1.add(l4); f1.add(t4);
        f1.add(b1); f1.add(b2); f1.add(b3); f1.add(b4);

        // Create connection
        connect();

        f1.setVisible(true);
        

    }
    
    public void connect()
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Load driver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_swing_10","root","");
            System.out.println("Database Connected!");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(f1, "Connection Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e)  
    {
        if (e.getSource() == b1) 
        {  
        	if (t1.getText().equals("") || t2.getText().equals("")||t3.getText().equals("") || t4.getText().equals("")) 
                {
                    JOptionPane.showMessageDialog(f1,"Please fill all fields before inserting!","Input Error", JOptionPane.WARNING_MESSAGE);
                    return; 
                }
            try 
            {
                pst = con.prepareStatement("INSERT INTO student(id, first_name, last_name, mobile) VALUES (?, ?, ?, ?)");
                pst.setInt(1, Integer.parseInt(t1.getText()));
                pst.setString(2, t2.getText());
                pst.setString(3, t3.getText());
                pst.setString(4, t4.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(f1, "Record Inserted!");
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(f1, "Error: " + ex.getMessage());
                ex.printStackTrace();
            }
            
        }
        
        else if(e.getSource()==b2)
        {
        	if(t1.getText().equals(""))
        	{
        		JOptionPane.showMessageDialog(f1,"Please fill all fields before searching!","Input Error", JOptionPane.WARNING_MESSAGE);
                return; 
        	}
        	try
        	{
        		pst=con.prepareStatement("select * from student where id=?");
        		pst.setInt(1, Integer.parseInt(t1.getText()));
        		
        		ResultSet rs=pst.executeQuery();
        		
        		if(rs.next())
        		{
        			t2.setText(rs.getString("first_Name"));
        			t3.setText(rs.getString("Last_Name"));
        			t4.setText(rs.getString("mobile"));
        		}
        		else
        		{
        			JOptionPane.showMessageDialog(f1, "No Data Found with this ID!,","search result", JOptionPane.INFORMATION_MESSAGE);
        		}
        		
        	}
        	catch (SQLException ex) 
        	{
        		JOptionPane.showMessageDialog(f1, "Error: " + ex.getMessage());
                ex.printStackTrace();
			}
        	
        }
        
        else if(e.getSource()==b3)
        {
        	if(t1.getText().equals(""))
        	{
        		JOptionPane.showMessageDialog(f1,"Please fill all fields before Updated!","Input Error", JOptionPane.WARNING_MESSAGE);
                return; 
        	}
        	try
        	{
        		pst=con.prepareStatement("update student set First_Name=?,Last_Name=?,mobile=? where Id=?");
        		pst.setInt(1,Integer.parseInt(t1.getText()));
        		pst.setString(1, t2.getText());
                pst.setString(2, t3.getText());
                pst.setString(3, t4.getText());
                pst.setInt(4, Integer.parseInt(t1.getText()));
                
                int rows = pst.executeUpdate();
                if(rows > 0) 
                {
                    JOptionPane.showMessageDialog(f1, "Record updated successfully!");
                } else {
                    JOptionPane.showMessageDialog(f1, "No record found with the given ID.");
                }
        		
        	}
        	catch (SQLException ex) 
        	{
				JOptionPane.showMessageDialog(f1,"Error: "+ex.getMessage());
			}
        }
        
        else if(e.getSource()==b4)
        {
        	if(t1.getText().equals(""))
        	{
        		JOptionPane.showMessageDialog(f1, "Please fill all fields before deleted!","Input Error", JOptionPane.WARNING_MESSAGE);
        		return;
        	}
        	try
        	{
        		pst=con.prepareStatement("delete from student where Id=?");
        		pst.setInt(1, Integer.parseInt(t1.getText()));
        		
        		int row=pst.executeUpdate();
        		
        		if(row>0)
        		{
        			 JOptionPane.showMessageDialog(f1, "Record deleted successfully!");
        		}
        		else
        		{
        			 JOptionPane.showMessageDialog(f1, "No Record found!");
        		}
        		
        	}
        	catch (SQLException ex)
        	{
				JOptionPane.showMessageDialog(f1, "Error: "+ex.getMessage());
			}
        }
 }

    public static void main(String[] args) 
    {
        new SwingDemo();
    }
}
