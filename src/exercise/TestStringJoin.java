package exercise;

import java.util.StringJoiner;

public class TestStringJoin {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(", ");
		sj.add("alpha");
		sj.add("theta");
		sj.add("gamma");
		String theResult = sj.toString();
		System.out.println(theResult);

	}

}
