import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class PrintBonus {
	public static void main(String[] args) {
		printBonusDatesBetween(1000, 3016);
    }
	
	public static void printBonusDatesBetween(int fromYear, int toYear)
	{
		for(int i = fromYear; i < toYear; i++)
		{
			String dateString = String.valueOf(i);
			StringBuilder sb = new StringBuilder(dateString);  
		    String revertedDate = sb.reverse().toString();
		    String month = revertedDate.substring(0, 2);
		    String day = revertedDate.substring(2, 4);
		    dateString = dateString + "-" + month + "-" + day;
		    LocalDate date = null;
		    
		    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        try {
	        	date = LocalDate.parse(dateString, dateFormatter);
	            System.out.println(date.toString());
	        } catch (DateTimeParseException e) {
	            continue;
	        }
		    
		}
	}
}
