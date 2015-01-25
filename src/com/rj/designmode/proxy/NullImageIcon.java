package com.rj.designmode.proxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;

public class NullImageIcon extends ImageIcon {

	private static final long serialVersionUID = 1L;
	Thread retrievalThread;
	boolean retrieving = false;
	ImageIcon imageIcon;
	URL imageURL;

	public NullImageIcon(URL url, ImageIcon imageIcon) {
		super();
		this.imageIcon = imageIcon;
		this.imageURL = url;
	}

	@Override
	public int getIconHeight() {
		return 600;
	}

	@Override
	public int getIconWidth() {
		return 800;
	}

	@Override
	public synchronized void paintIcon(final Component c, Graphics g, int x, int y) {
		g.drawString("Loading CD cover, please wait.....", x + 300, y + 190);
		if (!retrieving) {
			retrieving = true;
			retrievalThread = new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						imageIcon = new ImageIcon(imageURL, "CD cover");
						c.repaint();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			retrievalThread.start();
		}
	}
}
