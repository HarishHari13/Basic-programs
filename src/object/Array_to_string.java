package object;

import java.util.Arrays;

public class Array_to_string {

	public static void main(String[] args) {
		
		String vowels = "a:bc:de:fg:h";
		String[] result=vowels.split(":",-2);
		System.out.println("result when limit is -2=" +Arrays.toString(result));
		result = vowels.split(":",2);
		System.out.println("result when limit is 2=" +Arrays.toString(result));
		result = vowels.split(":",4);
		System.out.println("result when limit is 4=" +Arrays.toString(result));
		result = vowels.split(":",10);
		System.out.println("result when limit is 10=" +Arrays.toString(result));

	}

}
