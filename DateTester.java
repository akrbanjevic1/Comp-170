
public class DateTester {
	
	public static void main (String[] args) {
		int month = 12;
		int day = 31;
		int year = 2018;
		
		Date today = new Date();
		
		String x = today.getDate();
		System.out.println(x);
		
		Date tomorrow = new Date(12, 30, 2018);
		//tomorrow.setMonth(13); should produce an error correctly
		//tomorrow.setYear(0); this one too
		String tomorrowDate = tomorrow.getDate();
		System.out.println(tomorrowDate);
		
		Date newDay = new Date(month,day,year);
		System.out.println(newDay);
		
		if (tomorrow.equals(newDay)) {
			System.out.println("The day is the same");
		}
		
		else {
			System.out.println("They are not the same dates");
		}
		System.out.println(Date.NumberOfInstances() + " is the number of instances");
	////////////////////////This is where you left off sunday night\\\\\\\\\\\\\\\\\\\\\
		Date day1 = new Date(05,16,2000);
		
		month = 05;
		day = 16;
		year = 2000;
		Date day2 = new Date(month, day, year);
		
		
		String printday1 = day1.getDate();
		String printday2 = day2.getDate();
		System.out.println(printday1);
		System.out.println(printday2);
		
		if (day1.isLessThan(day2)) {
			System.out.println("Day1 is less than day2");
		}
		if(day1.equals(day2)) {
			System.out.println("The dates are equal!");
		}
		else {
			System.out.println("Day2 is less than day1");
		}
		
	}
	
}
