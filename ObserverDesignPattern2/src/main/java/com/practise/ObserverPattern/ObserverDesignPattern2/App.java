package com.practise.ObserverPattern.ObserverDesignPattern2;

import com.practise.ObserverPattern.ObserverDesignPattern2.Observable.IPhoneObservable;
import com.practise.ObserverPattern.ObserverDesignPattern2.Observable.StocksObservable;
import com.practise.ObserverPattern.ObserverDesignPattern2.Observer.EmailObserver;
import com.practise.ObserverPattern.ObserverDesignPattern2.Observer.MessageObserver;
import com.practise.ObserverPattern.ObserverDesignPattern2.Observer.NotificationObserver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       StocksObservable stocksObservable=new IPhoneObservable();
       
       NotificationObserver observer1=new MessageObserver(stocksObservable, "12345");
       NotificationObserver observer2=new EmailObserver(stocksObservable, "abc@123");
       NotificationObserver observer3=new EmailObserver(stocksObservable, "123@123");
       
       stocksObservable.add(observer1);
       stocksObservable.add(observer2);
       stocksObservable.add(observer3);
    
       stocksObservable.setData(2);
       
       
    }
}
