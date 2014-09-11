package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import food.Bacon;
import food.ChickenBreast;
import food.Corn;
import food.Lemon;
import food.OrganicGarlic;
import food.OrganicOliveOil;
import food.Pasta;
import food.Pepper;
import food.Salt;
import food.Vinegar;

public class Recipet implements Menu {
	private static Map<String, List<Contain>> menu;
	
	static {
		menu = new HashMap<String, List<Contain>>();
		List<Contain> contain = new ArrayList<Contain>();
		contain.add(new Contain(1, new OrganicGarlic()));
		contain.add(new Contain(1, new Lemon()));
		contain.add(new Contain(3.0/4, new OrganicOliveOil()));
		contain.add(new Contain(3.0/4, new Salt()));
		contain.add(new Contain(1.0/2, new Pepper()));
		menu.put("Salad Dressing", contain);
		
		List<Contain> contain1 = new ArrayList<Contain>();
		contain1.add(new Contain(1, new OrganicGarlic()));
		contain1.add(new Contain(4, new Corn()));
		contain1.add(new Contain(4, new Bacon()));
		contain1.add(new Contain(8, new Pasta()));
		contain1.add(new Contain(1.0/3, new OrganicOliveOil()));
		contain1.add(new Contain(5.0/4, new Salt()));
		contain1.add(new Contain(3.0/4, new Pepper()));
		menu.put("Pasta Fiesta", contain1);

		List<Contain> contain2 = new ArrayList<Contain>();
		contain2.add(new Contain(1, new OrganicGarlic()));
		contain2.add(new Contain(4, new ChickenBreast()));
		contain2.add(new Contain(1.0/2, new OrganicOliveOil()));
		contain2.add(new Contain(1.0/2, new Vinegar()));
		menu.put("Healthy Chicken Breast", contain2);
	}
	
	@Override
	public List<Contain> getContains(String name) {
		return menu.get(name);
	}
}
