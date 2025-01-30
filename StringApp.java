package Assignment;

import java.util.*;

public class StringApp {
	public static void main(String args[]) {
		//creating string
		String name="thanmaya";
		String names=new String("thanmaya");
		if(name==names) {
			System.out.println(name.hashCode());
			System.out.println(names.hashCode());
			
			System.out.println("Same location");
		}
		else {
			System.out.println("different location");
		}
		if(name.equals(names)){
			System.out.println("same");
		}
		else {
			System.out.println("different");
		}
		
		StringTokenizer words=new StringTokenizer("happy new year to everyone");
		int countTokens=words.countTokens();
		System.out.println(countTokens);
		while(words.hasMoreTokens()) {
			System.out.println(words.nextToken());
		}
		
		
		
	}

}
