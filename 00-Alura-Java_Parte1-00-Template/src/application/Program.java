package application;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message = "Erro validando objeto: <html> <table> <thead> <tr> <th> Degree Latitude </th><th> Minutos Latitude </th><th> Segundos Latitude </th><th> Degree Longitude </th><th> Minutos Longitude </th><th> Segundos Longitude </th> </tr> </thead><tbody> <tr> <td> field_lat_deg </td><td> field_lat_min </td><td> field_lat_sec </td><td> field_lon_deg </td><td> field_lon_min </td><td> field_lon_sec </td> </tr> </tbody> </table> </html>";
		String rep = message.replaceAll("Erro validando objeto: ", "");
		JOptionPane.showMessageDialog(null, rep);

	}

}
