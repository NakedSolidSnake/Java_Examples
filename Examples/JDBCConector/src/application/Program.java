package application;

import java.sql.Connection;
import java.util.Locale;
import java.util.Scanner;

import db.DB;

public class Program {

	public static void main(String[] args) {
		Connection connection = DB.getConnection();
		DB.closeConnection();
	}

}
