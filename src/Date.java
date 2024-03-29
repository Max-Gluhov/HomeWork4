//Aviyam
public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		this(1, 1, 0);
	}

	public Date(int day, int month, int year) {
		if (((day > 0) && (day <= 30)) && ((month > 0) && (month <= 12)) && (year > 0) && (year <= 2024)) {
			this.day = day;
			this.month = month;
			this.year = year;
		} else {
			this.day = 1;
			this.month = 1;
			this.year = 0;
		}
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		if ((day > 0) && (day <= 30))
			this.day = day;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		if ((month > 0) && (month <= 12))
			this.month = month;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		if ((year > 0) && (year <= 2024))
			this.year = year;
	}

	public int[] dateDist(Date other) {
		int[] dateDist = new int[3];
		dateDist[0] = this.day - other.getDay();
		// Check month underflow
		if (dateDist[0] < 0) {
			dateDist[0] += 30;
			dateDist[1]--;
		}
		dateDist[1] += (this.month - other.getMonth());
		// Check year underflow
		if (dateDist[1] < 0) {
			dateDist[1] += 12;
			dateDist[2]--;
		}
		dateDist[2] += (this.year - other.getYear());
		return dateDist;
	}

	public int calcAge() {
		Date currDate = new Date(1, 1, 2024);
		int[] Dist = currDate.dateDist(this);
		return Dist[2];
	}

	public String toString() {
		String printDate = this.day + "/" + this.month + "/" + this.year;
		return printDate;

	}

}
