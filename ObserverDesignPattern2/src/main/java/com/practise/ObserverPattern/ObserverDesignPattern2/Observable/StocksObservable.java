package com.practise.ObserverPattern.ObserverDesignPattern2.Observable;

import com.practise.ObserverPattern.ObserverDesignPattern2.Observer.NotificationObserver;

public interface StocksObservable {

	void add(NotificationObserver observer);
	void remove(NotificationObserver observer);
	void notifyObserver();
	void setData(int productStock);
	int getData();
}
