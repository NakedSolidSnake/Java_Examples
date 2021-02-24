package entities;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuiBotao extends JPanel implements Common{

	private JButton btMensagem, btTeimoso;
	private ImageIcon imageIcon1;
	
	public GuiBotao(){
		inicializarComponentes();
		definirEventos();
	}
	
	@Override
	public void inicializarComponentes() {
		// TODO Auto-generated method stub
		setLayout(null);
		imageIcon1= new ImageIcon("java.jpg");
		btMensagem = new JButton("Mensagem", imageIcon1);
		btMensagem.setBounds(50,20,140,38);
		btMensagem.setMnemonic(KeyEvent.VK_M);
		btMensagem.setToolTipText("Clique aqui para ver a mensagem");
		btTeimoso = new JButton("Teimoso");
		btTeimoso.setBounds(50,70,100,25);
		add(btMensagem);
		add(btTeimoso);
	}

	@Override
	public void definirEventos() {
		// TODO Auto-generated method stub
		btMensagem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Botao Mensagem");
			}
		});
		
		btTeimoso.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Botao Teimoso");				
			}
		});
		
		btTeimoso.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				btTeimoso.setBounds(50,70,100,25);
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				btTeimoso.setBounds(50,120,100,25);
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
