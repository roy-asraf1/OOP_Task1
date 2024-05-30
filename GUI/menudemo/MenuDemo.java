package GUI.menudemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MenuDemo extends JFrame implements ActionListener{
	static final long serialVersionUID=1L;
	JMenuBar wholeMenuBar;
	JMenu fileMenu, editMenu;
	JMenuItem openItem, saveItem, copyItem, pasteItem;
	JTextField textField;
	int textFieldSize = 10;
	private Container _window;
	Point [] _p =new Point[100];
	int _np = 0;
	public MenuDemo(){
		_np=0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_window = this.getContentPane();
		_window.setLayout(new FlowLayout());
		_window.setPreferredSize(new Dimension(300,250));
	}
	public void createGui(){
		ImageIcon icon = new ImageIcon("Images\\middle.gif");
		wholeMenuBar = new JMenuBar();
		setJMenuBar(wholeMenuBar);
		wholeMenuBar.setVisible(true);
		// file menu with open, save
		fileMenu = new JMenu("File");
		fileMenu.addActionListener(this);
		openItem = new JMenuItem("Open",icon);
		fileMenu.add(openItem);
/*
    Sets the key combination which invokes the menu item's action
    listeners without navigating the menu hierarchy.
    It is the UI's responsibility to install the correct action.
    Note that when the keyboard accelerator is typed,
    it will work whether or not the menu is currently displayed.
    Parameters:
    keyStroke - the KeyStroke which will serve as an accelerator
    CTRL_MASK - This flag indicates that the Control key was down
    when the event occurred.
*/
		openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
		openItem.addActionListener(this);
		saveItem = new JMenuItem("Save", icon);
		fileMenu.add(saveItem);
		saveItem.addActionListener(this);
		saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));

		wholeMenuBar.add(fileMenu);
		// edit menu with copy paste
		editMenu = new JMenu("Edit");
		copyItem = new JMenuItem("Copy");
		editMenu.add(copyItem);
		copyItem.addActionListener(this);
		pasteItem = new JMenuItem("Paste");
		editMenu.add(pasteItem);
		pasteItem.addActionListener(this);
		wholeMenuBar.add(editMenu);
		textField = new JTextField(textFieldSize);
		_window.add(textField);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == openItem){
			textField.setText("open choozen");
		}
		if(e.getSource() == saveItem){
			textField.setText("save choozen");
		}
		if(e.getSource() == copyItem){
			textField.setText("copy choozen");
		}
		if(e.getSource() == pasteItem){
			textField.setText("paste choozen");
		}
	}
	public static void main(String[] args) {
		MenuDemo frame = new MenuDemo();
		frame.setSize(250, 200);
		frame.createGui();
		frame.setVisible(true);
	}
}
