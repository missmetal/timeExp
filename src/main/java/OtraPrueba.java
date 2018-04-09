import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class OtraPrueba {
	 static LocalDate start;
	  static LocalDate end;
	  static Period recurrence;  // e.g. 7 days

	  public static void main(String args[]) {
		  start= LocalDate.of(2017, 4, 20);
		  end = LocalDate.now();
		  recurrence= Period.ofDays(7);
		  System.out.println(includes(end));
	  }
	  
	  public static boolean includes(LocalDate dateTime) {
		    LocalDate tmpStart = start;
		    LocalDate tmpEnd = end;

		    int distance = (int) ChronoUnit.DAYS.between(start, dateTime) - 1;
		    if (distance > 0) {
		        int factor = (int) (distance / recurrence.getDays());
		        if (factor > 0) {
		            Period quickAdvance = recurrence.multipliedBy(factor);
		            tmpStart = start.plus(quickAdvance);
		            tmpEnd = end.plus(quickAdvance);
		        }
		    }

		    while (!tmpStart.isAfter(dateTime)) {
		        if (tmpEnd.isAfter(dateTime)) {
		            return true;
		        }
		        tmpStart = tmpStart.plus(recurrence);
		        tmpEnd = tmpEnd.plus(recurrence);
		    }

		    return false;
		  }
}
