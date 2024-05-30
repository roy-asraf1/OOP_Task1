package GUI.simplegui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FirstGUI extends JFrame implements ActionListener{
	private final JButton _buttonPress = new JButton("Press Me");
	private final JTextField _inputText = new JTextField("",25);
	private int i = 0;
	
	public FirstGUI() {
		super("Simple Example");
		// Moves and resizes this component. 
		// The new location of the top-left corner is  specified by x and y, 
		// and the new size is specified by width and height
		// setBounds(x,y,width,height)
		this.setBounds(200,200,400,150);
		// Exit on close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Returns the contentPane object for this frame
		Container window = this.getContentPane();
		// Sets the layout manager for this container
		window.setLayout(new FlowLayout());
		// Appends the specified component to the end of this container. 
		window.add(_buttonPress);
		window.add(_inputText);
		//Then we register the program as a listenerfor action events
		// from the button _buttonPress
		_buttonPress.addActionListener(this);
		_inputText.setFont(new Font("Arial", Font.BOLD, 14));
		_inputText.setForeground(Color.red);
		_inputText.setBackground(Color.yellow);
		_inputText.setHorizontalAlignment(JTextField.CENTER);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == _buttonPress) {
			_inputText.setText("I'm pressed " + i++);
		}

	}
	public static void main(String[] args) {
		FirstGUI app = new FirstGUI();
		app.setVisible(true);

	}

}
