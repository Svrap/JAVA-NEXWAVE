package test1;
import java.time.LocalDate;
import java.time.LocalTime;
public class TimDat {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDate d = LocalDate.of(19, 01, 10);
		System.out.println("DATE = "+ date.getDayOfMonth()+"/"+date.getMonthValue()+"/"+date.getYear());
		System.out.println("TIME =" + time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		System.out.println("DATE = "+ d.getDayOfMonth()+"/"+d.getMonthValue()+"/"+d.getYear());
	}

}
