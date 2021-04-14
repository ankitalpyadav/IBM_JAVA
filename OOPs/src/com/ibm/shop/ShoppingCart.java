package com.ibm.shop;

import java.util.ArrayList;
import java.util.HashMap;

import com.ibm.bank.BalanceException;

public class ShoppingCart {
	
	private double cartTotal;
	//private  Product[] items;
	ArrayList<Product> items = new ArrayList<Product>();
	HashMap<String, Integer> coupons = new HashMap<String, Integer>();
	
	
	//String [][] coupns = {{"HOLI200", "200"},{"WKND100","100"},{"APRIL150","150"}};
	
	public ShoppingCart() {
		//items = new Product[5];
		coupons.put("HOLI200", 200);
		coupons.put("WKND100", 100);
		coupons.put("APRIL100", 100);
		
	}

	public void addProduct(Product p) throws OutOfStockException {
		
//		if (idx < items.length) {
//			
//			if (p.getStock()>=1) {
//				p.setStock(p.getStock() - 1)  ;
//				items[idx++] = p;
//				cartTotal += p.getPrice();
//			}
//			else if (p.getStock()==0) {
//				//throw new OutOfStockException("Product out of stock");
//				System.out.println("Product out of stock");
//			}
//			
//		} 
//		else {
//			System.out.println("Your cart is full");
//		}
		
		
		
			items.add(new Product(p.getName(), p.getPrice(), p.getStock()));
			cartTotal += p.getPrice();
		
	}
	
	public void checkout(Payment pmt, String code) throws PaymentDeniedException{
//		if (idx == 0)
//			System.out.println("your cart is empty");
//		else{
//				System.out.println("Products in your cart : ");
//				for (int i=0; i<idx; i++) {
//					System.out.println(items[i].getName() +" : "+ items[i].getPrice());
//				} 
//				System.out.println("Your cart total is " + cartTotal);
//				
//				System.out.println();
//				System.out.println("------ Proceeding to Payment -------");
//				System.out.println("Your Account Number is : " + pmt.getAcntNo());
//				
//				
//				if (cartTotal >= 300 && pmt.getBalance() > cartTotal) {
//					
//					
//					for (int i=0; i<coupns.length; i++) {
//						for (int j=0; j<coupns[i].length; j++) 
//						{
//							if (code == coupns[i][0]) {
//								cartTotal = cartTotal - Integer.parseInt(coupns[i][1]);
//								System.out.println("Your cart total after applying " + code + " is " + cartTotal);
//								break;
//							}
//							else if (code == coupns[i][0]) {
//								cartTotal = cartTotal - Integer.parseInt(coupns[i][1]);
//								System.out.println("Your cart total after applying " + code + " is " + cartTotal);
//								break;
//							}
//							else if (code == coupns[i][0]) {
//								cartTotal = cartTotal - Integer.parseInt(coupns[i][1]);
//								System.out.println("Your cart total after applying " + code + " is " + cartTotal);
//								break;
//							}
//					
//						} 
//					}
//					
//				}
//				
//				else if (pmt.getBalance() < cartTotal) {
//					System.out.println("Insufficient balance in your accountc " + pmt.getBalance());
//				}
//				else {
//					System.out.println("Your final cart total is " + cartTotal);
//				}
//				
//			}
		System.out.println("Products in your cart : ");
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i).getName() + " : " + items.get(i).getPrice() );
		}
		System.out.println("Your cart total is " + cartTotal);
		
		System.out.println();
		System.out.println("------ Proceeding to Payment -------");
		System.out.println("Your Account Number is : " + pmt.getAcntNo());
		
		if (cartTotal >= 300 && pmt.getBalance() > cartTotal) {
			for (String key: coupons.keySet()) {
//			    System.out.println(key + " : "+ coupons.get(key));
				if (key == "WKND200") {
					cartTotal -= coupons.get(key);
					System.out.println("Your cart total after applying " + key + " is " + cartTotal);
				}
			}
		}
		
	
	}
		
		
}
