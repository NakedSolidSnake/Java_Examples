package application;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Program extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public Program() {
		initUI();
	}
	
	private void initUI() {
		setTitle("Simple example");
		setSize(300, 200);
		setLocationRelativeTo(null);	//center screen
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() ->{
			var ex = new Program();
			ex.setVisible(true);
		});

	}

}
