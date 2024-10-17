package com.digitalinnovationone.webstore.service;

import com.digitalinnovationone.webstore.domain.model.User;

public interface UserService {
	User findById(Long id);
	User create(User user);
}