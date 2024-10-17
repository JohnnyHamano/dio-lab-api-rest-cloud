package com.digitalinnovationone.webstore.domain.repository;

import com.digitalinnovationone.webstore.domain.model.User;
import com.digitalinnovationone.webstore.domain.model.base.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
	boolean existsByAccount(Account account);
}