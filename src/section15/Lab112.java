package section15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
//este lo corrieron con Ngtest
import org.testng.annotations.Test;

public class Lab112 {
	@Test // anotacion de text
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// example();
		// streamFilter();
		// streamMap();
		streamCollect();
	}

	public static void example() {
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

	@Test
	public static void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Juan");
		names.add("Carlos");
		names.add("Daniel");
		names.add("Ariel");
		names.add("Zulma");

		Long c = names.stream().filter(s -> s.startsWith("A")).count();

		System.out.println(c);

		long d = Stream.of(names.get(0), names.get(1), names.get(2), names.get(3), names.get(4)).filter(s -> {
			s.startsWith("A");
			return true;
		}).count();

		System.out.println(d);

		// minuto 28

		names.stream().filter(s -> {
			if (s.length() > 4) {
				return true;
			} else {
				return false;
			}
		}).forEach(s -> System.out.println(s));

		names.stream().filter(s -> (s.length() > 4)).limit(1).forEach(s -> System.out.println(s));
	}

	public static void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Manuel");
		names.add("Enrique");
		names.add("Daniela");
		names.add("Jorge");
		names.add("Sofia");
		names.add("Laura");

		Stream.of(names.get(0), names.get(1), names.get(2), names.get(3), names.get(4)).filter(s -> s.endsWith("l"))
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		names.stream().filter(s -> s.startsWith("A")).map(s -> s.toUpperCase()).sorted()
				.forEach(s -> System.out.println(s));

		List<String> nombres = Arrays.asList("Juan", "Carlos", "Daniel", "Ariel", "Zulma", "Juanita", "Abel");

		Stream<String> newStream = Stream.concat(nombres.stream(), names.stream());

		/*
		 * //Merging 2 different lists newStream .sorted()
		 * .forEach(s->System.out.println(s));
		 */

		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Juan"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

	public static void streamCollect() {
		// list
		// new list

		List<String> ls = Stream.of("Juan", "Carlos", "Daniela", "Ariel", "Zulma", "Juanita", "Abel")
				.filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).collect(Collectors.toList());

		System.out.println(ls.get(0));

		List<Integer> numeros = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);

		numeros.stream().distinct().sorted().collect(Collectors.toList()).forEach(s -> System.out.println(s));

		int tercero = numeros.stream().distinct().sorted().collect(Collectors.toList()).get(2);

		System.out.println(tercero);

	}

}