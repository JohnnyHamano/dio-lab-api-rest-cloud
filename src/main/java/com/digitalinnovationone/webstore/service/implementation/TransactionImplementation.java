package com.digitalinnovationone.webstore.service.implementation;

import com.digitalinnovationone.webstore.domain.model.Transaction;
import com.digitalinnovationone.webstore.domain.repository.TransactionRepository;
import com.digitalinnovationone.webstore.service.TransactionService;
import org.springframework.stereotype.Service;
import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.NoSuchElementException;

@Service
public class TransactionImplementation implements TransactionService {
	private final TransactionRepository repository;
	
	public TransactionImplementation(TransactionRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Transaction findById(Long id) {
		return repository.findById(id).orElseThrow(NoSuchElementException::new);
	}
	
	@Override
	public Transaction create(Transaction transaction)
	{
		if (transaction.getId() != null && repository.existsById(transaction.getId()))
		{
			throw new KeyAlreadyExistsException();
		}
		
		return repository.save(transaction);
	}
}