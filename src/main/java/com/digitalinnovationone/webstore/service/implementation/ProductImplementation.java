package com.digitalinnovationone.webstore.service.implementation;

import com.digitalinnovationone.webstore.domain.model.Product;
import com.digitalinnovationone.webstore.domain.repository.ProductRepository;
import com.digitalinnovationone.webstore.service.ProductService;
import org.springframework.stereotype.Service;
import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.NoSuchElementException;

@Service
public class ProductImplementation implements ProductService {
	private final ProductRepository repository;
	
	public ProductImplementation(ProductRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Product findById(Long id) {
		return repository.findById(id).orElseThrow(NoSuchElementException::new);
	}
	
	@Override
	public Product create(Product product)
	{
		if (product.getId() != null && repository.existsById(product.getId()))
		{
			throw new KeyAlreadyExistsException();
		}
		
		return repository.save(product);
	}
}