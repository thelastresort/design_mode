package com.rj.designmode.proxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {

	ImageIcon imageIcon;

	public ImageProxy(URL url) {
		imageIcon = new NullImageIcon(url, imageIcon);
	}

	@Override
	public int getIconHeight() {
		return imageIcon.getIconHeight();
	}

	@Override
	public int getIconWidth() {
		return imageIcon.getIconWidth();
	}

	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		imageIcon.paintIcon(c, g, x, y);
	}

}
