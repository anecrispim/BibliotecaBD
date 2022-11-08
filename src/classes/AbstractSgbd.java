package classes;

public class AbstractSgbd {
	private Connection connection;
	private DataBase bd;

	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	public DataBase getBd() {
		return bd;
	}
	public void setBd(DataBase bd) {
		this.bd = bd;
	}
}
