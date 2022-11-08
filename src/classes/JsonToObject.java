package classes;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonToObject {
	private String json;
	private String archive;
	
	public JsonToObject(String archive) {
		this.setArchive(archive);
		this.readJson();
	}
	
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
			String json = String.join(" ", Files.readAllLines(Paths.get(this.archive), StandardCharsets.UTF_8));
			this.setJson(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public AbstractSgbd getSgbd() {
		//Type type = new TypeToken<AbstractSgbd>(){}.getType();
		AbstractSgbd abstractElem = new Gson().fromJson(this.getJson(),AbstractSgbd.class);
		return abstractElem;
	}
	
}
