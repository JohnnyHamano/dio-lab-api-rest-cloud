package com.digitalinnovationone.webstore.service.implementation;

import com.digitalinnovationone.webstore.domain.model.User;
import com.digitalinnovationone.webstore.domain.repository.UserRepository;
import com.digitalinnovationone.webstore.service.UserService;
import org.springframework.stereotype.Service;
import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.NoSuchElementException;

@Service
public class UserImplementation implements UserService {
	private final UserRepository repository;
	
	public UserImplementation(UserRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public User findById(Long id) {
		return repository.findById(id).orElseThrow(NoSuchElementException::new);
	}
	
	@Override
	public User create(User user)
	{
		if (user.getId() != null && repository.existsById(user.getId()))
		{
			throw new KeyAlreadyExistsException();
		}
		
		if (repository.existsByAccount(user.getAccount()))
		{
			throw new IllegalArgumentException("This user already exists.");
		}
		
		return repository.save(user);
	}
}