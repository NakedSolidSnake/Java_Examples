package application;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Program extends JFrame{
	
	public Program() {
		initUI();
	}
	
	private void initUI() {
		
		createMenuBar();
		
		setTitle("Simple Menu");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createMenuBar() {
		var menubar = new JMenuBar();
		var exitIcon = new ImageIcon("src/resources/exit.png");
		
		var fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		var eMenuItem = new JMenuItem("Exit", exitIcon);
		eMenuItem.setMnemonic(KeyEvent.VK_E);
		eMenuItem.setToolTipText("Exit application");
		eMenuItem.addActionListener((event) -> System.exit(0));
		
		fileMenu.add(eMenuItem);
		menubar.add(fileMenu);
		
		setJMenuBar(menubar);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
            var ex = new Program();
            ex.setVisible(true);
        });
	}

}
