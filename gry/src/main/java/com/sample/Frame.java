package com.sample;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Frame extends JFrame {

	/**
	 * Create the frame.
	 */
	
	JButton btnOk;
	private String odp;
	boolean pom = true;
	
	
	public Frame(String odp) {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnOk = new JButton("OK");
		
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(btnOk, BorderLayout.SOUTH);
		
		this.odp = odp;

	}
	
	public void Action3(
			JRadioButton r1, JRadioButton r2,JRadioButton r3, String a, String b, String c, ButtonGroup g) {
			
		while(pom == true) {
		
		 btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				r1.setActionCommand(a);
				r2.setActionCommand(b);
				r3.setActionCommand(c);
				String rev = g.getSelection().getActionCommand();	
				setOdp(rev);
				pom = false;
			}
		});
		 
		}
		
	}

	
	public String getOdp() {
        return this.odp;
    }

    public void setOdp(String odp) {
        this.odp = odp;
    }

}
