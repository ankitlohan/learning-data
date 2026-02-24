package Java_W3school;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import Learning.Second;

public class DateTime {

	public static void main(String[] args) {
		
		//Date
		LocalDate Date = LocalDate.now();
		System.out.println("Today date " + Date);
		
		//Time
		LocalTime Time = LocalTime.now();
		System.out.println("Today Time " + Time);
		
		//Date and Time		
		LocalDateTime DateTime = LocalDateTime.now();
		System.out.println("Today Date and Time " + DateTime);
		
		//Date time Formatter
		DateTimeFormatter formateDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");		
		String newDate = DateTime.format(formateDate);
		System.out.println(newDate);
		
		DateTimeFormatter formateDate1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");		
		String newDate1 = DateTime.format(formateDate1);
		System.out.println(newDate1);
		
		DateTimeFormatter formateDate2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");		
		String newDate2 = DateTime.format(formateDate2);
		System.out.println(newDate2);
		
		DateTimeFormatter formateDate3 = DateTimeFormatter.ofPattern("E, MMM-dd-yyyy HH:mm:ss");		
		String newDate3 = DateTime.format(formateDate3);
		System.out.println(newDate3);

	}

}
