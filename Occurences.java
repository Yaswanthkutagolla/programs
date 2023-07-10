package Program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Occurences {
public static void main(String[] args) {
	System.out.println("Enter String");
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	System.out.println(result(s));
}
public static Map<Character,Integer> result(String s){
	Map<Character,Integer> map=new HashMap<>();
	for(char c:s.toCharArray())
	{
		map.put(c, map.getOrDefault(c, 0)+1);
	}
	
	return map;
}
}
