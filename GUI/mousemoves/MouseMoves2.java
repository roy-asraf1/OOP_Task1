/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.mousemoves;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Elizabeth
 */
public class MouseMoves2 extends JFrame implements MouseMotionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField _text;
    private JPanel _panel;
    int _oldX = 0, _oldY = 0;
    private JButton _button;
    Graphics _paper;

    public MouseMoves2() {
        super("Mouse Moves Demo");
        //	Moves and resizes this component.
        //	The new location of the top-left corner is  specified by x and y,
        //	and the new size is specified by width and height
        //	setBounds(x,y,width,height)
        this.setBounds(0, 0, 400, 300);
        //	Exit on close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createGui() {
        //	A Container is a component  that can contain other GUI components
        this.setLayout(new FlowLayout());
        _panel = new JPanel();
        Dimension d = new Dimension(200, 200);
        _panel.setPreferredSize(d);
        _panel.setBackground(Color.white);
        this.add(_panel);
        _panel.addMouseMotionListener(this);

        _button = new JButton("Clear");
        this.add(_button);
        _button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                _panel.removeAll();
                repaint();
            }
        });
        _text = new JTextField("", 10);
        this.add(_text);
    }

    public void mouseDragged(MouseEvent event) {
        _paper = _panel.getGraphics();
        int newX = event.getX();
        int newY = event.getY();
        _paper.setColor(Color.blue);
        _paper.drawLine(_oldX, _oldY, newX, newY);
        _oldX = newX;
        _oldY = newY;
        _text.setText("x = " + Integer.toString(newX)
                + " y = " + Integer.toString(newY));
    }

    public void mouseMoved(MouseEvent event) {
        int newX = event.getX();
        int newY = event.getY();
        _oldX = newX;
        _oldY = newY;
        _text.setText("x = " + Integer.toString(newX)
                + " y = " + Integer.toString(newY));
    }

    public static void main(String[] args) {
        MouseMoves2 frame = new MouseMoves2();
        frame.createGui();
        frame.setVisible(true);
    }
}
