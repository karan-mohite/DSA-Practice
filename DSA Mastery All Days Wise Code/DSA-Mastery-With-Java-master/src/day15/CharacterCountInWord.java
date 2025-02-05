package day15;

import java.util.HashMap;

public class CharacterCountInWord {

	public static void main(String[] args) {
		String word="apple";
	
		HashMap<Character,Integer> charCountMap=new HashMap();
		for(char c:word.toCharArray())  //c='a'
		{
			if(charCountMap.containsKey(c))		             // a : 1
			{									             // p : 2
				charCountMap.put(c, charCountMap.get(c)+1);  // l : 1
			}                                                // e : 1
			else
			{
				charCountMap.put(c, 1);
			}
		}
		
		System.out.println(charCountMap);

	}

}
