package com.rj.designmode.templatemethod;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setSize(300, 300);
		this.setVisible(true);
	}

	@Override
	public void paint(Graphics arg0) {
		super.paint(arg0);
		String msg = "I rule!";
		arg0.drawString(msg, 100, 100);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MyFrame myFrame = new MyFrame("Head First Design Patterns");
	}
}
