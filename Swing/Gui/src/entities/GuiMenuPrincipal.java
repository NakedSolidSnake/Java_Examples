package entities;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiMenuPrincipal extends JFrame implements Common{
	private Container contentPane;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnExemplos;
	private JMenuItem miSair, miBotao;
	
	private GuiMenuPrincipal() {
		inicializarComponentes();
		definirEventos();
	}

	@Override
	public void inicializarComponentes() {
		// TODO Auto-generated method stub
		setTitle("Menu Principal");
		setBounds(0,0,800,600);
		contentPane = getContentPane();
		mnBarra = new JMenuBar();
		mnArquivo = new JMenu("Arquivo");
		mnArquivo.setMnemonic('A');
		mnExemplos = new JMenu("Exemplos");
		mnExemplos.setMnemonic('E');
		
		miSair = new JMenuItem("Sair", new ImageIcon("sair.jpg"));
		miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
		
		miBotao = new JMenuItem("Botao");
		mnArquivo.add(miSair);
		mnExemplos.add(miBotao);
		mnBarra.add(mnArquivo);
		mnBarra.add(mnExemplos);
		setJMenuBar(mnBarra);
	}

	@Override
	public void definirEventos() {
		miSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		miBotao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GuiBotao botao = new GuiBotao();
				contentPane.removeAll();
				contentPane.add(botao);
				contentPane.validate();
			}
		});
	}
	
	public static void abrir() {
		GuiMenuPrincipal frame = new GuiMenuPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width) / 2,
							(tela.height - frame.getSize().height) / 2);
		frame.setVisible(true);
	}

}
