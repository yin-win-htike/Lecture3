package exercise;

import java.util.StringJoiner;

public class TestStringJoin {

	public static void main(String[] args) {

		exercise5();
	}

	private static void exercise1() {
		StringJoiner sj = new StringJoiner(", ");
		sj.add("alpha");
		sj.add("theta");
		sj.add("gamma");
		String theResult = sj.toString();
		System.out.println(theResult);
	}

	// Handling a single value
	private static void exercise2() {
		StringJoiner sj = new StringJoiner(", ");
		sj.add("alpha");

		String theResult1 = sj.toString();

		System.out.println(theResult1);
		
		StringJoiner sj2 = new StringJoiner(", ","{", "}");
		sj2.add("alpha");

		String theResult2 = sj2.toString();
		System.out.print(theResult2);

	}
	private static void exercise3() {
		StringJoiner sj = new StringJoiner(", ");
	
		String theResult1 = sj.toString();

		System.out.println(theResult1);
		
		StringJoiner sj2 = new StringJoiner(", ","{", "}");
		
		String theResult2 = sj2.toString();
		System.out.print(theResult2);
	}
	//default Empty Example
	private static void exercise4() {
		StringJoiner sj = new StringJoiner(", ");
		sj.setEmptyValue("EMPTY");
		String theResult1 = sj.toString();

		System.out.println(theResult1);
		
		StringJoiner sj2 = new StringJoiner(", ","{", "}");
		sj2.setEmptyValue("EMPTY");
		String theResult2 = sj2.toString();
		System.out.print(theResult2);
	}
	//Customzing Empty Handling
	private static void exercise5() {
		StringJoiner sj = new StringJoiner(", ");
		sj.setEmptyValue("EMPTY");
		sj.add("");
		String theResult1 = sj.toString();

		System.out.println(theResult1);
		
		StringJoiner sj2 = new StringJoiner(", ","{", "}");
		sj2.setEmptyValue("EMPTY");
		sj2.add("");
		String theResult2 = sj2.toString();
		System.out.print(theResult2);
	}
}
