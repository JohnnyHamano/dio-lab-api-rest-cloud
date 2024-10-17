package com.digitalinnovationone.webstore;

import com.digitalinnovationone.webstore.domain.model.Product;
import java.util.HashMap;

public class ShoppingCart {
	private final HashMap<Product, Integer> cart = new HashMap<Product, Integer>();
	
	public HashMap<Product, Integer> getCart() {
		return cart;
	}
	
	public int getProduct(Product product) {
		return cart.get(product);
	}
	
	public void addToCart(Product product, int quantity) {
		if (hasProduct(product)) {
			int currentQuantity = getProduct(product);
			int newQuantity = currentQuantity + quantity;
			cart.put(product, newQuantity);
		}
		else {
			cart.put(product, quantity);
		}
	}
	
	public boolean hasProduct(Product product) {
		return cart.containsKey(product);
	}
	
	public void removeProductFromCart(Product product) {
		cart.remove(product);
	}
	
	public void removeItem(Product product, int quantity) {
		if (hasProduct(product)) {
			int newQuantity = getProduct(product) - quantity;
			
			if (newQuantity <= 0) {
				removeProductFromCart(product);
			}
			else {
				addToCart(product, newQuantity);
			}
		}
	}
	
	public float getTotalPrice() {
		float total = 0;
		
		for (HashMap.Entry<Product, Integer> item : cart.entrySet()) {
			Product product = item.getKey();
			total += product.getPrice() * item.getValue();
		}
		
		return total;
	}
}