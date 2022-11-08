package classes;

import java.util.ArrayList;

public class DataBase {
	private String sgbd;
	private String dataBaseName;
	private ArrayList<Tables> tables = new ArrayList<Tables>();
	
	public String getSgbd() {
		return sgbd;
	}

	public void setSgbd(String sgbd) {
		this.sgbd = sgbd;
	}

	public ArrayList<Tables> getTables() {
		return tables;
	}

	public void setTables(ArrayList<Tables> tables) {
		this.tables = tables;
	}

	public String getDataBaseName() {
		return dataBaseName;
	}

	public void setDataBaseName(String dataBaseName) {
		this.dataBaseName = dataBaseName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DataBase [sgbd=");
		builder.append(sgbd);
		builder.append(", dataBaseName=");
		builder.append(dataBaseName);
		builder.append(", tables=");
		builder.append(tables);
		builder.append("]");
		return builder.toString();
	}
	
	
}
