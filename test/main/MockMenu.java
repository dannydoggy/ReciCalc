package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import food.Lemon;
import food.OrganicGarlic;
import food.OrganicOliveOil;
import food.Pepper;
import food.Salt;

public class MockMenu implements Menu{
private static Map<String, List<Contain>> menu1;
	
	static {
		menu1 = new HashMap<String, List<Contain>>();
		List<Contain> contain = new ArrayList<Contain>();
		contain.add(new Contain(1, new OrganicGarlic()));
		contain.add(new Contain(1, new Lemon()));
		contain.add(new Contain(1, new OrganicOliveOil()));
		contain.add(new Contain(1, new Salt()));
		contain.add(new Contain(1, new Pepper()));
		menu1.put("testMenu", contain);
		
		
	}
	
	@Override
	public List<Contain> getContains(String name) {
		return menu1.get(name);
	}

}
