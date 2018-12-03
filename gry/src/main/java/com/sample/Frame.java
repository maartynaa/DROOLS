package com.sample;

import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Frame(){
	    	gui();
	}
	
	public void gui() {
		
		setVisible(true);
    	setSize(300, 300);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
   
    	JButton b = new JButton("OK");
    	add(b, BorderLayout.SOUTH);
    	
    	
    	
	}
	
	
}
