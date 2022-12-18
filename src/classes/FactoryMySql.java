package classes;

import java.sql.SQLException;
import java.sql.Statement;

public class FactoryMySql extends FactorySgbd {
	private MySql mysql;
	
	public MySql getMysql() {
		return mysql;
	}
	public void setMysql(MySql mysql) {
		this.mysql = mysql;
	}

	public void criar() {
		JsonToObject jsonToObject = new JsonToObject("src/json/json.json");
		
		AbstractSgbd abs = jsonToObject.getSgbd();
		
		if (abs.validaSgbd()) {
			MySql mysql = new MySql();
			mysql.setBd(abs.getBd());
			mysql.setConnection(abs.getConnection());
			this.setMysql(mysql);
		} else {
			System.exit(1);
		}
	}

	public void executar() {
		try {
			this.criar();
			MySql mysql = this.getMysql();
			Statement stmt = mysql.doConnection();
			stmt.execute(mysql.createDataBase());
			stmt.execute(mysql.useDataBase());
			for (String tbCreations : mysql.createTables()) {
				stmt.execute(tbCreations);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void mostrar() {
		this.criar();
		MySql mysql = this.getMysql();
		System.out.println(mysql.createDataBase());
		System.out.println(mysql.useDataBase());
		for (String tbCreations : mysql.createTables()) {
			System.out.println(tbCreations);
		}
	}
}
