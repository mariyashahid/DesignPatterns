package com.practise.decoratorDesignPattern;

public class ExtraCheese  extends ToppingsDecorator {

	
	BasePizza pizza;
	ExtraCheese(BasePizza pizza){
		this.pizza=pizza;
	}
	
	@Override
	public int cost() {
		System.out.println(pizza.cost());
		System.out.println("jnj"+((pizza.cost())+20));
		return pizza.cost()+20;
	}

	
	
}
