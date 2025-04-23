	package com.practise.decoratorDesignPattern;

import java.util.Scanner;

public class PizzaBilling 
{
    public static void main( String[] args )
    {
    	
       	while(true) {
    		
    		System.out.println("Chose Base");
    		System.out.println("1. Veg Delite 2. Magherita 3. Exit ");
    		Scanner sc=new Scanner(System.in);
    		int baseChoice=sc.nextInt();
    		
       		if(baseChoice==1 || baseChoice==2) {
       			int cost=0;
       			BasePizza pizza=null;
       			if(baseChoice == 1) {
       			    pizza =new VegDelite();
       			} else if (baseChoice == 2) {
       			    pizza =new Magherita();
       			}
       			
    			while(true) {
    				
    				System.out.println("Choice Toppings");
    				System.out.println("1. Mushroom 2. Extra Cheese 3. Exit");
    				int toppingsChoice=sc.nextInt();
    				
    				switch(toppingsChoice) {
    					case 1: 
    						pizza=new MushromToppingsDecorator(pizza);
    						cost=pizza.cost();
    						System.out.println(" Pay Bill : "+ cost);
    						break;
    						
    					case 2: 
    						pizza=new ExtraCheese(pizza);
    						cost=pizza.cost();
    						System.out.println(" Pay Bill : "+ cost);
    						break;
    						
    					case 3: 
    						return;
    					
    					default:
    						System.out.println("Please choose right option");
    				}
    			}
    			
    		}
       		if(baseChoice==3) {
       			break;
       		}
       		else{
       			System.out.println("Please Enter Valid Choice ");
       		}
       		sc.close();
    	}
    }
}
