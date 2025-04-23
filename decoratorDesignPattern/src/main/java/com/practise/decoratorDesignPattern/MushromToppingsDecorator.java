package com.practise.decoratorDesignPattern;

public class MushromToppingsDecorator extends ToppingsDecorator {

	BasePizza pizza;
	MushromToppingsDecorator(BasePizza pizza) {
		
		this.pizza=pizza;
		
	}
	
	@Override
	public int cost() {
	
		return pizza.cost() +10 ;
	}

}
