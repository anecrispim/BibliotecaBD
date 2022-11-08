package classes;

import java.util.List;
import java.util.ArrayList;

public class Tables {
	private String name;
	private List<Columns> columns = new ArrayList<Columns>();

	public List<Columns> getColumns() {
		return columns;
	}
	public void setColumns(List<Columns> columns) {
		this.columns = columns;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tables [name=");
		builder.append(name);
		builder.append(", columns=");
		builder.append(columns);
		builder.append("]");
		return builder.toString();
	}
}
