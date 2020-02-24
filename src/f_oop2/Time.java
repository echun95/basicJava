package f_oop2;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour >= 0 && hour < 24){
			this.hour = hour;
		}else if(hour >= 24){
			this.hour = 23;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		int mok = 0;
		if(minute >= 0 && minute < 60){
			this.minute = minute;
		}else if(minute >= 60){
			hour += minute/60;
			mok = minute / 60;
			this.minute = minute - 60*mok;
			if(hour>23){
				hour = 23;
			}
		}
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {		
		int mok = 0;
		if(second >= 0 && second <60 ){
			this.second = second;
		}
		else if(second >= 60){
			minute += second/60;
			mok = second/60;
			this.second = second - 60*mok;
			if(minute > 59){
				hour += minute/60;
				mok = minute/60;
				minute = minute - 60* mok;
				if(hour > 23){
					hour = 23;
				}
			}
		}
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
}
