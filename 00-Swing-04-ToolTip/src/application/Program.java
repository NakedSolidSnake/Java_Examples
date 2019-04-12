package application;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Program extends JFrame{
	
	public Program() {
		initUI();
	}
	
	private void initUI() {
		var btn = new JButton("Button");
		btn.addActionListener((event) -> System.exit(0));
		btn.setToolTipText("A button component");
		
		createLayout(btn);
		
		setTitle("Tooltip");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void createLayout(JComponent ...components) {
		var pane = (JPanel)getContentPane();
		var gl = new GroupLayout(pane);
		pane.setLayout(gl);
		
		pane.setToolTipText("Content pane");
		
		gl.setAutoCreateContainerGaps(true);
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(components[0]).addGap(200));
		gl.setVerticalGroup(gl.createSequentialGroup().addComponent(components[0]).addGap(120));
		
		pack();		
	}
	
	

	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {
			var ex = new Program();
			ex.setVisible(true);
		});

	}

}
