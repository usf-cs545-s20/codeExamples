package maps;

import java.util.HashMap;
import java.util.Map.Entry;

/** Illustrates how to use a HashMap */
public class Dictionary {

	private HashMap<String, String> dict = new HashMap<String, String>();

	public void addWordDefinition(String word, String description) {
		dict.put(word, description);
	}
	
	public void printInfo()  {
		System.out.println("Dictionary:");
		for (String key : dict.keySet()) {
			System.out.println(key + ": " + dict.get(key));
		}
	}
	public static void main(String[] args) {
		Dictionary d = new Dictionary();
		d.addWordDefinition("boredom", "The state of being bored");
		d.addWordDefinition("university", "A school that offers courses leading to a degree");
		d.printInfo();
	}

}
