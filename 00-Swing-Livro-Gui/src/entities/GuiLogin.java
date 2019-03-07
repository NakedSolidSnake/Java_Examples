package entities;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiLogin extends JFrame implements Common{
	
	private JTextField tfLogin;
	private JLabel lbSenha; 
	private JLabel lbLogin;
	private JButton btLogar;
	private JButton btCancelar;
	private JPasswordField pfSenha;
	private static GuiLogin frame = new GuiLogin();
	
	
	public static GuiLogin getInstance() {
		return frame;
	}
	
	private GuiLogin() {
		inicializarComponentes();
		definirEventos();
	}

	@Override
	public final void inicializarComponentes() {
		setTitle("Login no Sistema");
		setBounds(0,0,250,200);
		setLayout(null);
		
		tfLogin = new JTextField(5);
		pfSenha = new JPasswordField(5);
		lbSenha = new JLabel("Senha");
		lbLogin = new JLabel("Login:");
		btLogar = new JButton("Logar");
		btCancelar = new JButton("Cancelar");
		tfLogin.setBounds(100,30,120,25);
		lbLogin.setBounds(30,30,50,25);
		lbSenha.setBounds(30,75,80,25);
		pfSenha.setBounds(100,75,120,25);
		btLogar.setBounds(20,120,100,25);
		btCancelar.setBounds(125,120,100,25);
		add(tfLogin);
		add(lbSenha);
		add(lbLogin);
		add(btLogar);
		add(btCancelar);
		add(pfSenha);		
	}

	@Override
	public final void definirEventos() {
		btLogar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String senha = String.valueOf(pfSenha.getPassword());
				if(tfLogin.getText().equals("java7") && senha.equals("java7")) {
					frame.setVisible(false);
					GuiMenuPrincipal.abrir();
				}
				else {
					JOptionPane.showMessageDialog(null,  "Login ou Senha incorretas!");
				}
			}
		});
		
		btCancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
}
