package GUI.mousemoves;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MouseMoves extends JFrame implements MouseMotionListener, ActionListener{
	private static final long serialVersionUID = 1L;

	private JTextField _text;
	private JPanel _panel;
	int _oldX=0,  _oldY=0;
	private JButton _button;
	Graphics _paper;

	public MouseMoves(){
		super("Mouse Moves Demo");
		//	Moves and resizes this component.
		//	The new location of the top-left corner is  specified by x and y,
		//	and the new size is specified by width and height
		//	setBounds(x,y,width,height)
		this.setBounds(0,0,400,300);
		//	Exit on close
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void createGui(){
		//	A Container is a component  that can contain other GUI components
		this.setLayout(new FlowLayout());

		_button = new JButton("Clear");
		this.add(_button);
		_button.addActionListener(this);

		//	Add "panel" to be used for drawing
		_panel = new JPanel();
		Dimension d= new Dimension(200,200);
		_panel.setPreferredSize(d);
		_panel.setBackground(Color.white);
		this.add(_panel);
		_panel.addMouseMotionListener(this);

		//		A GUI component that holds a line of text - either for display or input
		_text = new JTextField("",10);
		this.add(_text);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == _button){
			_panel.removeAll();
			repaint();
		}
	}

	public void mouseDragged(MouseEvent event){
		_paper = _panel.getGraphics();
		int newX = event.getX();
		int newY = event.getY();
		_paper.setColor(Color.blue);
		_paper.drawLine(_oldX, _oldY, newX, newY);
		_oldX = newX;
		_oldY = newY;
		_text.setText("x = "+Integer.toString(newX)+
				" y = "+Integer.toString(newY));

	}

	public void mouseMoved(MouseEvent event){
		int newX = event.getX();
		int newY = event.getY();
		_oldX = newX;
		_oldY = newY;
		_text.setText("x = "+Integer.toString(newX)+
				" y = "+Integer.toString(newY));
	}
    public static void main(String[] args) {
		MouseMoves frame = new MouseMoves();
		frame.createGui();
		frame.setVisible(true);
    }
}
