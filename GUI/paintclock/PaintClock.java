/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.paintclock;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Elizabeth
 */
public class PaintClock extends JFrame {

	private static final long serialVersionUID = 1L;

	Date theDate;
	private JPanel _panel;

	public PaintClock() {
		//		Exit on close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("DIGITAL  CLOCK");
		this.setBounds(100, 50, 400, 200);
		_panel = new JPanel();
		_panel.setPreferredSize(new Dimension(400, 200));
		this.add(_panel);
	}

	public void createClock() {
		while (true) {
			theDate = new Date();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
	}

	public void paint(Graphics g) {
		Font theFont = new Font("ARIAL", Font.BOLD, 24);
		g = _panel.getGraphics();
		g.clearRect(0, 0, 400, 300);
		g.setFont(theFont);
		g.setColor(Color.RED);
		g.drawString(theDate.toString(), 10, 50);
	}

	public static void main(String[] args) {
		PaintClock app = new PaintClock();
		app.setVisible(true);
		app.createClock();
	}
}
