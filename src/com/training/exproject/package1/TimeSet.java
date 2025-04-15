package com.training.exproject.package1;

public class TimeSet {
	private int hour;
	private int minute;
	private int sec;
	
	private final int FROMHOUR = 0;
	private final int TOHOUR = 23;
	
	private final int FROMMINUTE = 0;
	private final int TOMINUTE = 59;
	
	private final int FROMSEC = 0;
	private final int TOSEC = 59;
	
	public TimeSet() {
		hour = 0;
		minute = 0;
		sec = 0;
	}
	
	public TimeSet(int hour, int minute, int sec) {
		if (hour < FROMHOUR || hour > TOHOUR) {
			hour = 0;
		}
		
		if (minute < FROMMINUTE || minute > TOMINUTE) {
			minute = 0;
		}
		
		if (sec < FROMSEC || sec > TOSEC) {
			sec = 0;
		}
		
		this.hour = hour;
		this.minute = minute;
		this.sec = sec;
	}
	
	public void setHour(int hour) {
		if (hour < FROMHOUR || hour > TOHOUR) {
			hour = 0;
		}
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setMinute(int minute) {
		
		if (minute < FROMMINUTE || minute > TOMINUTE) {
			minute = 0;
		}
		
		this.minute = minute;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setSec(int sec) {
		if (sec < FROMSEC || sec > TOSEC) {
			sec = 0;
		}
		
		this.sec = sec;
	}
	
	public int getSec() {
		return sec;
	}
	
	public void setTime(int hour, int minute, int sec) {
		if (hour < FROMHOUR || hour > TOHOUR) {
			hour = 0;
		}
		
		if (minute < FROMMINUTE || minute > TOMINUTE) {
			minute = 0;
		}
		
		if (sec < FROMSEC || sec > TOSEC) {
			sec = 0;
		}
		
		this.hour = hour;
		this.minute = minute;
		this.sec = sec;
	}
	
	public void addHours(int h) {
		hour = (hour + h) % 24;
	}
	
	public void addMinutes(int m) {
		int totalMinute = minute + m;
		addHours(totalMinute/60);
		minute = totalMinute % 60;
	}
	
	public void addSec(int s) {
		int totalSec = sec + s;
		addMinutes(totalSec/60);
		sec = totalSec % 60;
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, sec);
	}
		

}
