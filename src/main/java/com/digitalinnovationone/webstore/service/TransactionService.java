package com.digitalinnovationone.webstore.service;

import com.digitalinnovationone.webstore.domain.model.Transaction;

public interface TransactionService {
	Transaction findById(Long id);
	Transaction create(Transaction transaction);
}