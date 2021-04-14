package com.ibm.pizza;

	public class Pizza {
		double price;
		double top = 50;
		public double order(String size, int toppings) {
			if (size == "S") {
					if (toppings >=2 && toppings <= 5)  {
						top = top * toppings; 
						double price = 100 + top;
						return price;
					}	
			}
			else if(size=="M") {
				if (toppings >=2 && toppings <= 5) {
					top = top * toppings; 
					double price = 200 + top;
					return price;
				}
			}
			else if(size=="L") {
				if (toppings >=2 && toppings <= 5) {
					top = top * toppings; 
					double price = 300 + top;
					return price;
				}
			}
			else {
				System.out.println("no match");
			}
			return price;
			
		}
}
