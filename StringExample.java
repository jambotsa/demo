package apexfremont;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		s.close();
		Map<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();
		char[] data = input.toCharArray();
		// each character with count
		for(char c : data) {
			if(lhm.containsKey(c)) {
				lhm.put(c,lhm.get(c)+1);
			} else {
				lhm.put(c,1);
			}
		}
		System.out.println(lhm);
	}
}
