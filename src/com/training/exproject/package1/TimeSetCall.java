package com.training.exproject.package1;

public class TimeSetCall {

	public static void main(String[] args) {
		TimeSet time = new TimeSet();
		TimeSet time2 = new TimeSet(13,15,48);
		
		System.out.println(time);
		System.out.println(time2);
		
		time.addHours(5);
		
		System.out.println(time);
		time.addHours(35);
		System.out.println(time);

	}

}
