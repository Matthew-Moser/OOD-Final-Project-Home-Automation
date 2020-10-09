package pck1;
import java.time.*;
import java.time.format.DateTimeFormatter; 
public class InternalClock {
	LocalDateTime currentDateTime = LocalDateTime.now();
	//line 7 for maintenance/revision as pattern is not hardcoded into DateTimeFormatter
	private String pattern = "E, MMM dd yyyy HH:mm:ss";
	DateTimeFormatter internalClockFormatted = DateTimeFormatter.ofPattern(pattern);
	
	String formattedDate = currentDateTime.format(internalClockFormatted);
	
	//use this in the exe
	//System.out.println("Current date and time is" + internalClockFormatted);
}
