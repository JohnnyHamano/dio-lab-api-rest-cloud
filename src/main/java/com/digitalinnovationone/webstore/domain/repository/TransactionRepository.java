package com.digitalinnovationone.webstore.domain.repository;

import com.digitalinnovationone.webstore.domain.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>
{
}