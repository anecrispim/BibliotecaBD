package classes;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Json {
	private String json;
	private String archive;
	
	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public String getArchive() {
		return archive;
	}

	public void setArchive(String archive) {
		this.archive = archive;
	}
	
	public void readJson() {
		try {
			String json = String.join(" ", Files.readAllLines(Paths.get(this.getArchive()), StandardCharsets.UTF_8));
			this.setJson(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
