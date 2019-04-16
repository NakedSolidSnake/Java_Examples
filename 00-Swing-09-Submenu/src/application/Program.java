package application;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Program extends JFrame{
	
	public Program() {
		initUI();
	}

	
	private void initUI() {
		createMenuBar();
		
		setTitle("Submenu");
		setSize(360, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
	}
	
	private void createMenuBar(){
		var menubar = new JMenuBar();
		
		var iconNew =  new ImageIcon("src/resources/new.png");
		var iconOpen = new ImageIcon("src/resources/open.png");
		var iconSave = new ImageIcon("src/resources/save.png");
		var iconExit = new ImageIcon("src/resources/exit.png");
		
		var fileMenu = new JMenu("File");
		var impMenu = new JMenu("Import");
		
		var newMenuItem = new JMenuItem("New", iconNew);
        var openMenuItem = new JMenuItem("Open", iconOpen);
        var saveMenuItem = new JMenuItem("Save", iconSave);
        var exitMenuItem = new JMenuItem("Exit", iconExit);
        
        exitMenuItem.setToolTipText("Exit application");

        newMenuItem.addActionListener((event) -> JOptionPane.showMessageDialog(this,
                "Houve um problema ao procurar o batman:\n\n '" + "erro" + "'.",
                "Erro 404", 
                JOptionPane.INFORMATION_MESSAGE)); 
        
        exitMenuItem.addActionListener((event) -> System.exit(0));

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(impMenu);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

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
