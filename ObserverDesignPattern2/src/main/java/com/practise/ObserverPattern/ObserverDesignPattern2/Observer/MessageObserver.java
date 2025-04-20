package com.practise.ObserverPattern.ObserverDesignPattern2.Observer;

import com.practise.ObserverPattern.ObserverDesignPattern2.Observable.StocksObservable;

public class MessageObserver implements NotificationObserver {

	StocksObservable stockObservable;
	private String phoneNumber;
	
	public MessageObserver(StocksObservable stocksObservable, String phoneNumber) {
		
		this.stockObservable=stocksObservable;
		this.phoneNumber=phoneNumber;
		
	}
	public void update() {
		sendMssg(stockObservable.getData(),phoneNumber);
		
	}
	private void sendMssg(int data, String phoneNumber2) {
		System.out.println("Message Sent to : "+ phoneNumber2);
	}

}
