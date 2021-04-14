
public class Pizza {
	double price;
	double top = 50;
	public double order(String size, int toppings) {
		switch(size) {
		case "S":
			if (toppings >=2 && toppings <= 5)  {
				top = top * toppings; 
				double price = 100 + top;
				return price;
			}
			break;
		
		case "M":
			if (toppings >=2 && toppings <= 5) {
				top = top * toppings; 
				double price = 200 + top;
				return price;
			}
			break;
	
		case "L":
			if (toppings >=2 && toppings <= 5) {
				top = top * toppings; 
				double price = 300 + top;
				return price;
			}
			break;
			
		default:
            System.out.println("no match");
		}
		return price;
	}
}
