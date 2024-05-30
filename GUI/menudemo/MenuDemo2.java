/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.menudemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author Elizabeth
 */
public class MenuDemo2 extends JFrame {

	private static final long serialVersionUID = 1L;

	JMenuBar wholeMenuBar;
	JMenu fileMenu, editMenu;
	JMenuItem openItem, saveItem, copyItem, pasteItem;
	JTextField textField;
	int textFieldSize = 10;
	int _np = 0;

	public MenuDemo2() {
		_np = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setBounds(200, 200, 350, 250);

	}
	public void createGui(){
		ImageIcon icon = new ImageIcon("middle.gif");
		wholeMenuBar = new JMenuBar();
		setJMenuBar(wholeMenuBar);
		wholeMenuBar.setVisible(true);
		// file menu with open, save
		fileMenu = new JMenu("File");
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
		openItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("Open choozen");
			}
		});
		saveItem = new JMenuItem("Save", icon);
		fileMenu.add(saveItem);
		saveItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("Save choozen");
			}
		});
		saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));

		wholeMenuBar.add(fileMenu);
		// edit menu with copy paste
		editMenu = new JMenu("Edit");
		copyItem = new JMenuItem("Copy");
		editMenu.add(copyItem);
		copyItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("Copy choozen");
			}
		});
		pasteItem = new JMenuItem("Paste");
		editMenu.add(pasteItem);
		pasteItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("Paste choozen");
			}
		});
		wholeMenuBar.add(editMenu);
		textField = new JTextField(textFieldSize);
		this.add(textField);
	}

	public static void main(String[] args) {
		MenuDemo2 frame = new MenuDemo2();
		frame.createGui();
		frame.setVisible(true);
	}
}
