//Aviyam
public class Date {
	private int day;
	private int month;
	private int year;

	public Date()
	{
		this.day=1;
		this.month=1;
		this.year=0;
	}
	public Date(int day,int month,int year) 
	{
		if(((day>0)&&(day<=30))&&((month>0)&&(month<=12))&&(year>0)&&(year<=2024))
		{
			this.day=day;
			this.month=month;
			this.year=year;
		}
		
	}
	public int getDay()
	{
		return this.day;
	}
	public void setDay(int day)
	{
		if((day>0)&&(day<=30))
			this.day=day;
	}
	public int getMonth()
	{
		return this.month;
	}
	public void setMonth(int month)
	{
		if((month>0)&&(month<=12))
			this.month=month;
	}
	public int getYear()
	{
		return this.year;
	}
	public void setYear(int year)
	{
		if((year>0)&&(year<=2024))
			this.year=year;
	}
	public int[] dateDist(Date other)
	{
		int[]dateDist=new int[3];
		dateDist[0]=this.day-other.day;
		if(dateDist[0]<0)
		{
			dateDist[0]+=30;
			dateDist[1]--;
		}
		dateDist[1]+=(this.month-other.month);
		if(dateDist[1]<0) 
		{
			dateDist[1]+=12;
			dateDist[2]--;
		}
		dateDist[2]+=(this.year-other.year);
		return dateDist;
	}
	public static Date CurDate=new Date(1,1,2024);
	public int calcAge() 
	{
		int[]Dist=this.dateDist(CurDate);
		return Dist[2];
	}
	public String toString()
	{
		String PrintDate=this.day+"/"+this.month+"/"+this.year;
		return PrintDate;

	}


}
