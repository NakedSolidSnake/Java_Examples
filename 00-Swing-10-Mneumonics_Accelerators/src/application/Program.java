package application;

public class Program {
	
	public Program() {

        initUI();
    }

    private void initUI() {

        createMenuBar();

        setTitle("Mnemonics and accelerators");
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        var menubar = new JMenuBar();

        var iconNew = new ImageIcon("src/resources/new.png");
        var iconOpen = new ImageIcon("src/resources/open.png");
        var iconSave = new ImageIcon("src/resources/save.png");
        var iconExit = new ImageIcon("src/resources/exit.png");

        var fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        var newMenuItem = new JMenuItem(new MenuItemAction("New", iconNew,
                KeyEvent.VK_N));

        var openMenuItem = new JMenuItem(new MenuItemAction("Open", iconOpen,
                KeyEvent.VK_O));

        var saveMenuItem = new JMenuItem(new MenuItemAction("Save", iconSave,
                KeyEvent.VK_S));

        var exitMenuItem = new JMenuItem("Exit", iconExit);
        exitMenuItem.setMnemonic(KeyEvent.VK_E);
        exitMenuItem.setToolTipText("Exit application");
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,
                ActionEvent.CTRL_MASK));

        exitMenuItem.addActionListener((event) -> System.exit(0));

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        menubar.add(fileMenu);

        setJMenuBar(menubar);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
