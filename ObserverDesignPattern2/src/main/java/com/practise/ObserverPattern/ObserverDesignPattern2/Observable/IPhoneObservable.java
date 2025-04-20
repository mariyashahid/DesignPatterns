package com.practise.ObserverPattern.ObserverDesignPattern2.Observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.practise.ObserverPattern.ObserverDesignPattern2.Observer.NotificationObserver;

public class IPhoneObservable implements StocksObservable {

	private List<NotificationObserver> observer=new ArrayList<NotificationObserver>();
	private int stock=0;
	
	public void add(NotificationObserver notificationObserver) {
		// TODO Auto-generated method stub
		observer.add(notificationObserver);
	}

	public void remove(NotificationObserver notificationObserver) {
		// TODO Auto-generated method stub
		observer.remove(notificationObserver);
	}

	public void notifyObserver() {
		for(NotificationObserver o: observer) {
			o.update();
		}
	}

	public void setData(int productStock) {
		// TODO Auto-generated method stub
		if(stock==0) {
			notifyObserver();
		}
		stock+=productStock;
	}

	public int getData() {
		
		return stock;
	}

}
