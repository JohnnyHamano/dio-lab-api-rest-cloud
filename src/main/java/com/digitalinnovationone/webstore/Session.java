package com.digitalinnovationone.webstore;

import com.digitalinnovationone.webstore.domain.model.User;
import com.digitalinnovationone.webstore.domain.model.Product;
import com.digitalinnovationone.webstore.service.implementation.UserImplementation;
import org.springframework.beans.factory.annotation.Autowired;

public class Session
{
	@Autowired
	private UserImplementation userImplementation;
	
	@Autowired
	private ShoppingCart shoppingCart;
	
	private User user;
	
	public Session() {
		super();
	}
	
	public void login(Long id) {
		user = userImplementation.findById(id);
	}
	
	public void addToShoppingCart(Product product, int quantity) {
		shoppingCart.addToCart(product, quantity);
	}
}