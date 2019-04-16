package entities;

import javax.swing.JLabel;

public class MyLabel extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyLabel() {
		super("", null, LEADING);
	}
	
	@Override
	public boolean isOpaque() {
		return true;			
	}
}
