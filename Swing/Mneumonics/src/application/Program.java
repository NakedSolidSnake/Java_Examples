package application;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Program extends JFrame{
	
	public Program() {
		initUI();
	}
	
	private void initUI() {
		var btn = new JButton("Button");
		
		btn.addActionListener((event) -> System.out.println("Button Pressed"));
		
		btn.setMnemonic(KeyEvent.VK_B);
		
		createLayout(btn);
		
		setTitle("Mneumonics");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createLayout(JComponent ...components ) {
		
		var pane = getContentPane();
		var gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		gl.setAutoCreateContainerGaps(true);
		
		
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(components[0]).addGap(200));
		gl.setVerticalGroup(gl.createSequentialGroup().addComponent(components[0]).addGap(200));
		
		pack();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			var ex = new Program();
			ex.setVisible(true);
		});
	}

}
