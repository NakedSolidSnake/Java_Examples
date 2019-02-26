package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class Program {

	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		Date y1 = sdf1.parse("24/02/2019");
		Date y2 = sdf2.parse("24/02/2019 14:05:30");
		
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		
		System.out.println(x1);
		System.out.println(x2);

	}

}
