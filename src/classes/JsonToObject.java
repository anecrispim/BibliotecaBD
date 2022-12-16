package classes;

import com.google.gson.Gson;

public class JsonToObject extends Json implements ObjectBd{
	
	public JsonToObject(String archive) {
		super.setArchive(archive);
		super.readJson();
	}

	public AbstractSgbd getSgbd() {
		//Type type = new TypeToken<AbstractSgbd>(){}.getType();
		AbstractSgbd abstractElem = new Gson().fromJson(super.getJson(),AbstractSgbd.class);
		return abstractElem;
	}
	
}
