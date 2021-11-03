package section15;

import java.util.ArrayList;


import org.testng.annotations.Test;

public class test1 {
	@Test //anotacion de text
	public void regular() {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Juan");
		names.add("Carlos");
		names.add("Daniel");
		names.add("Ariel");
		names.add("Zulma");

		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}

		System.out.println(count);

	}

}
