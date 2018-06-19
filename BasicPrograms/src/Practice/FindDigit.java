package Practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindDigit {

	public FindDigit() {
		// TODO Auto-generated constructor stub
	}
  public static void main( String args[] ){

      // String to be scanned to find the pattern.
      String line = "This order was placed for QT3000! OK?";
      String pattern = "(.*)(\\d+)(.*)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Found value: " + m.group() );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group() );
      } else {
         System.out.println("NO MATCH");
      }
   }
}