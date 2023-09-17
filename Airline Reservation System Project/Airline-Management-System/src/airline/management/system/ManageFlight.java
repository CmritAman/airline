package airline.management.system;

import java.awt.EventQueue;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class ManageFlight extends JFrame{ //Third Frame

    
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6,textField_7;

        public ManageFlight(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("ADD FLIGHT DETAILS");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel f_code = new JLabel("FLIGHT CODE");
            f_code.setFont(new Font("Tahoma", Font.PLAIN, 10));
            f_code.setBounds(60, 30, 150, 27);
            add(f_code);
            
            textField = new JTextField();
            textField.setBounds(200, 30, 150, 27);
            add(textField);
			
            JButton Next = new JButton("SAVE");
            Next.setBounds(200, 420, 150, 20);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
			
            JLabel f_name = new JLabel("FLIGHT NAME");
            f_name.setFont(new Font("Tahoma", Font.PLAIN, 10));
            f_name.setBounds(60, 80, 150, 27);
            add(f_name);
			
            textField_1 = new JTextField();
            textField_1.setBounds(200, 80, 150, 27);
            add(textField_1);
            
            JLabel cap_in_eco = new JLabel("ECONOMY");
            cap_in_eco.setFont(new Font("Tahoma", Font.PLAIN, 10));
            cap_in_eco.setBounds(60, 120, 150, 27);
            add(cap_in_eco);
			
            textField_2 = new JTextField();
            textField_2.setBounds(200, 120, 150, 27);
            add(textField_2);
            		
            JLabel cap_in_bus = new JLabel("BUSINESS");
            cap_in_bus.setFont(new Font("Tahoma", Font.PLAIN, 10));
            cap_in_bus.setBounds(60, 170, 150, 27);
            add(cap_in_bus);
			
            textField_3 = new JTextField();
            textField_3.setBounds(200, 170, 150, 27);
            add(textField_3);
	
            JLabel cap_in_pre = new JLabel("PREMIUM");
            cap_in_pre.setFont(new Font("Tahoma", Font.PLAIN, 10));
            cap_in_pre.setBounds(60, 220, 150, 27);
            add(cap_in_pre);
	
            textField_4 = new JTextField();
            textField_4.setBounds(200, 220, 150, 27);
            add(textField_4);
	
            JLabel fl_time = new JLabel("FLIGHT TIMING");
            fl_time.setFont(new Font("Tahoma", Font.PLAIN, 10));
            fl_time.setBounds(60, 270, 150, 27);
            add(fl_time);
            
            textField_5 = new JTextField();
            textField_5.setBounds(200, 270, 150, 20);
            add(textField_5);
            
              JLabel src = new JLabel("FROM");
              src.setFont(new Font("Tahoma", Font.PLAIN, 10));
              src.setBounds(60, 320, 150, 27);
              add(src);
			
              textField_6 = new JTextField();
              textField_6.setBounds(200, 320, 150, 27);
              add(textField_6);
	
            setVisible(true);
	
            JLabel dst = new JLabel("TO");
            dst.setFont(new Font("Tahoma", Font.PLAIN, 10));
            dst.setBounds(60, 370, 150, 27);
            add(dst);

            textField_7 = new JTextField();
            textField_7.setBounds(200, 370, 150, 27);
            add(textField_7);
            
            
            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/front.png"));
            JLabel image = new JLabel(i1);
            image.setBounds(450,80,280,410);
            add(image);

            
            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String f_code = textField.getText();
                    String f_name = textField_1.getText();
                    String cap_in_eco =  textField_2.getText();
                    String cap_in_bus = textField_3.getText();
                    String cap_in_pre = textField_4.getText();
                    String fl_time= textField_5.getText();
                   
                    String src = textField_6.getText();
                    String dst = textField_7.getText();
                    
      
                    try {
                        conn c = new conn();
                        String str = "INSERT INTO manage values( '"+f_code+"', '"+f_name+"', '"+cap_in_eco+"','"+cap_in_bus+"', '"+cap_in_pre+"', '"+fl_time+"','"+src+"', '"+dst+"')";
                        
                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"flight Added");
                        setVisible(false);
                    
                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
		}
            });
			
            setSize(1000,800);
            setVisible(true);
            setLocation(400,200);
			
	}
        
    public static void main(String[] args){
        new ManageFlight();
    }   
}