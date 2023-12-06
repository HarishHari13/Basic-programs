package Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern pattern=Pattern.compile("JavaTraining",Pattern.CASE_INSENSITIVE);
Matcher matcher=pattern.matcher("Welcome JavaTraining");
	boolean matchFound=matcher.find();
	if(matchFound) {
		System.out.println("Match found");
	}
	else
	{
		System.out.println("Match not found");
	}
}

}
