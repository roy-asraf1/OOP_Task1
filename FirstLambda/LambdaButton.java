package lambda.FirstLambda;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaButton extends JFrame{

	private final JButton button = new JButton("Test Button");
	private final JTextField text = new JTextField("",25);
	int i;
	public LambdaButton() {
		super("Simple Example");
		this.setBounds(100,200,300,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container window = this.getContentPane();
		window.setLayout(new FlowLayout());
		window.add(button);
		window.add(text);
		text.setFont(new Font("Arial", Font.BOLD, 12));
		i = 0;
	}
	public void lambda() {
		button.addActionListener(e -> text.setText("Lambda Listener  "+i++));
	}
	public void anonym() {
		button.addActionListener(new ActionListener(){
			@Override 
			public void actionPerformed(ActionEvent ae){
				text.setText("Anonymous Listener " + i++);
			}
		});
	}
	public static void main(String[] args) {
		LambdaButton app = new LambdaButton();
		app.lambda();
		//app.anonym();
		app.setVisible(true);
	}
}
