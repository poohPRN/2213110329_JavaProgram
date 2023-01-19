
public class Time {

	private int second;
	private int minute;
	private int hour;
	
	//Default constructor
	public Time() {
		this.second=0;
		this.minute=0;
		this.hour=0;
	}
	//Contructor with parameter
	public Time(int second,int minute,int hour) {
		this.second= second;
		this.minute=minute;
		this.hour=hour;
	}
	
	//Getters and Setters methods
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public void setSecond(int Second) {
		this.second = Second;
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	public void setTime(int Second,int minute,int hour) {
		this.second= second;
		this.minute=minute;
		this.hour=hour;
	}
	//Advances this Time instance by one second
	public Time nextSecond() {
		++second;
		if(second>=60) {
			second = 0;
			++minute;
			if(minute>=60) {
				minute = 0;
				++hour;
				if(hour>=24) {
					hour =0;
				}//end of hour
			}//end of minute
		}//end of second
		return this;
	}
}
