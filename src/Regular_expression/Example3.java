package Regular_expression;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>Words=Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Maven","Amen","Eleven");
Pattern p = Pattern.compile(".even");
for(String word: Words) {
	Matcher m = p.matcher(word);
	if(m.matches())
		System.out.printf("%s ->matches",word);
	else
		System.out.printf("%s -> does not match%n", word);
			
}
		
	}

}
