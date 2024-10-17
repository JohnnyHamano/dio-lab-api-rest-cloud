package com.digitalinnovationone.webstore.service;

import com.digitalinnovationone.webstore.domain.model.Product;

public interface ProductService {
	Product findById(Long id);
	Product create(Product product);
}