package classes;
import java.sql.Statement;
import java.util.ArrayList;
public interface Sgbd {
	public Statement doConnection();
    public String createDataBase();
    public ArrayList<String> createTables();
}
