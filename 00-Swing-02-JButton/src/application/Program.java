package application;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Program extends JFrame{
	
	public Program() {
		initUI();
	}
	
	private void initUI() {
		var quitButton = new JButton("Quit");
		quitButton.addActionListener((event)->System.exit(0));  //event to close screen on click
		
		createLayout(quitButton);
		
		setTitle("Quit Button");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}
	
	private void createLayout(JComponent ...components) {   //mount components on the screen
		var pane = getContentPane();
		var gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		gl.setAutoCreateContainerGaps(true);
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(components[0]));
		gl.setVerticalGroup(gl.createSequentialGroup().addComponent(components[0]));		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			var ex = new Program();
			ex.setVisible(true);
		});

	}

}
