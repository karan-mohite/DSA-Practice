package day15;

import java.util.Arrays;
import java.util.HashMap;

public class WordCountInSentance {

	public static void main(String[] args) {
		String sentance="My Name is Alice Alice is a good girl";
	
		HashMap<String,Integer> wordCountMap=new HashMap();
		String[] words=sentance.split(" ");
		System.out.println(Arrays.toString(words));
		
		for(String c:words)                       									             // p : 2
			wordCountMap.put(c, wordCountMap.getOrDefault(c, 0) + 1);  
	                                             
			System.out.println(wordCountMap);
 		
	}

}
