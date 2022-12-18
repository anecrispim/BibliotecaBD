package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MySql extends AbstractSgbd implements Sgbd {

	public Statement doConnection() {
		try {
			Connection conexao;
			classes.Connection con = this.getConnection();
			//jdbc:mysql://ip/nome_do_banco
			String drive = String.format("jdbc:mysql://%s", con.getUrl());
			conexao = DriverManager.getConnection(drive, con.getUser(), con.getPassword());
			Statement Stmt = conexao.createStatement();
			return Stmt;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String createDataBase() {
		classes.DataBase db = this.getBd();
		String createDb = String.format("CREATE DATABASE %s;", db.getDataBaseName());
		return createDb;
	}
	
	public String useDataBase() {
		classes.DataBase db = this.getBd();
		String useDb = String.format("USE %s;", db.getDataBaseName());
		return useDb;
	}
	
	public ArrayList<String> createTables() {
		classes.DataBase db = this.getBd();
		String createTable = "CREATE TABLE %s (%s);";
		String createColumn = "%s %s";
		ArrayList<String> tablesCreations = new ArrayList<String>();
		for(Tables table : db.getTables()) {
			ArrayList<String> columnsCreations = new ArrayList<String>();
			for (Columns column : table.getColumns()) {
				columnsCreations.add(String.format(createColumn, column.getName(), column.getType()));
			}
			String columnsSt = String.join(",", columnsCreations);
			tablesCreations.add(String.format(createTable, table.getName(), columnsSt));	
		}
		return tablesCreations;
	}
}
