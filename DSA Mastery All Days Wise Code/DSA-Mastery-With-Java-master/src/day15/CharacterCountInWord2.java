package day15;

import java.util.HashMap;

public class CharacterCountInWord2 {

	public static void main(String[] args) {
		String word="apple";
	
		HashMap<Character,Integer> charCountMap=new HashMap();
		for(char c:word.toCharArray())                       									             // p : 2
		charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);  
                                             
		System.out.println(charCountMap);

	}

}
