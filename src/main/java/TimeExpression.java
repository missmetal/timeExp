import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class TimeExpression {

    public static TimeExpression on(LocalDate aDate) {
    	
        throw new RuntimeException("Must implement method: on");
    }

    public static TimeExpression dailyEveryFromOnwards(int anAmountOfDays, LocalDate aDate) {
    	return TimeExpression.on(aDate.plusDays(anAmountOfDays));
        //throw new RuntimeException("Must implement method: dailyEveryFromTo");
		
    }

    public static TimeExpression monthlyEveryOnFromOnwards(int anAmountOfMonths, int aDayInMonth, YearMonth anYear) {
        throw new RuntimeException("Must implement method: monthlyEveryOnFromTo");
    }

    public static TimeExpression monthlyEveryOnOfFromOnwards(int anAmountOfMonths, DayOfWeek aDayOfWeek, int aWeekInMonth, YearMonth anYear) {
        throw new RuntimeException("Must implement method: monthlyEveryOnOfFromTo");
    }

    public static TimeExpression yearlyEveryOnFromOnwards(int anAmountOfYears, MonthDay aMonthDay, int anYear) {
        throw new RuntimeException("Must implement method: yearlyEveryOnFromOnwards");
    }

    public boolean isRecurringOn(LocalDate aDate) {
    	LocalDate today= LocalDate.now();
/*    	
    	LocalDate tmpStart = start;
	    LocalDate tmpEnd = end;

	    int distance = (int) ChronoUnit.DAYS.between(start, aDate) - 1;
	    if (distance > 0) {
	        int factor = (int) (distance / recurrence.getDays());
	        if (factor > 0) {
	            Period quickAdvance = recurrence.multipliedBy(factor);
	            tmpStart = start.plus(quickAdvance);
	            tmpEnd = end.plus(quickAdvance);
	        }
	    }*/

	        if (today.isAfter(aDate)) 
	            return true;

        return false;
    }
}
