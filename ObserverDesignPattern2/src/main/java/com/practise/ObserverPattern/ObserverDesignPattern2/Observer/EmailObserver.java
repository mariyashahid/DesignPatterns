package com.practise.ObserverPattern.ObserverDesignPattern2.Observer;

import com.practise.ObserverPattern.ObserverDesignPattern2.Observable.StocksObservable;

public class EmailObserver implements NotificationObserver{

	StocksObservable stockObservable;
	private String userEmail;
	
	public EmailObserver(StocksObservable so, String email){
		this.stockObservable=so;
		this.userEmail=email;
	}

	public void update() {
		sendEmail(stockObservable.getData(),userEmail);
		
	}

	private void sendEmail(int data, String userEmail) {
		// TODO Auto-generated method stub
		System.out.println("Email sent to : "+ userEmail);
		
	}
	
	
	
}
