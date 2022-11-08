package classes;

public class Main {

	public static void main(String[] args) {
		JsonToObject jsonToObject = new JsonToObject("src/json/bdJSON.json");
		
		AbstractSgbd teste = jsonToObject.getSgbd();
		
		System.out.println(teste.getBd());	
	}

}
