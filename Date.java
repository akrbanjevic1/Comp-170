/**
 * 
 */

/**
 * @author akrba
 *
 */
public class Date {
	private int day;
	private int month;
	private int year;
	private static int counter;
	
	public Date () {
		day = 1;
		month = 1;
		year = 1976;
		counter++;
	}
	
	//Constructor example
	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
		counter++;
	}
	
	public static int NumberOfInstances() {
		return counter;
	}
	
	public void setDay(int d) {
		if (month <= 12) {
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (d <= 30) {
					this.day = d;
				}
				
				else {
					System.out.println(" This  is not a valid date." + 
				" you can't have more than 30 days.");
				}
			}
			else {
				if (d <= 31) {
					this.day = d;
				}
				else {
					System.out.println("This is an invalid date. You can't "
							+ "have more than 31 days.");
				 }
			}
		}
	}
	
	public void setMonth(int m) {
	  if (m > 0 && m < 13) {
		this.month = m;
	  }
	  else {
		  System.out.println("You have entered an invalid month");
	  }
	}
	
	public void setYear(int y) {
	  if (y > 0) {
		this.year = y; 
	  }
	  else {
		  System.out.println("You have entered an invalid year");
	  }
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	//one way to do it
	public String getDate() {
		return this.month + "/" + this.day + "/" + this.year;
	}
	
	//another way to do it
	public String toString() {
		return getMonth() + "/" + getDay() + "/" + getYear();
	}
	
	public boolean equals(Date otherDate) {
		if (day == otherDate.getDay() && month == otherDate.getMonth() && year == otherDate.getYear()) {
			return true;
		}
		else {
			return false; 
		}
	}
	
	public boolean isLessThan(Date otherDate) {
		if (year < otherDate.getYear() || (year == otherDate.getYear() && month < otherDate.getMonth()) 
				|| (year == otherDate.getYear() && month == otherDate.getMonth() && day < otherDate.getDay())) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isLessThan(int day, int month, int year) {
		if (this.year < year || (this.year == year && this.month < month) || (this.year == year && this.month == month
				&& this.day < day)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Date (Date otherDate) {
		day = otherDate.getDay();
		month = otherDate.getMonth();
		year = otherDate.getYear();
	}
}
