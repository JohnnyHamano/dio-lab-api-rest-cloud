package com.digitalinnovationone.webstore.controller;

import com.digitalinnovationone.webstore.domain.model.Transaction;
import com.digitalinnovationone.webstore.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;

@RestController
@RequestMapping("/transaction")
public class TransactionController
{
	private final TransactionService service;
	
	public TransactionController(TransactionService service) {
		this.service = service;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Transaction> findById(@PathVariable Long id) {
		return ResponseEntity.ok(service.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Transaction> create(@RequestBody Transaction transaction) {
		var newTransaction = service.create(transaction);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newTransaction.getId()).toUri();
		return ResponseEntity.created(uri).body(newTransaction);
	}
}