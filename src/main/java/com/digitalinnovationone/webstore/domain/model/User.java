package com.digitalinnovationone.webstore.domain.model;

import com.digitalinnovationone.webstore.domain.model.base.Account;
import com.digitalinnovationone.webstore.domain.model.base.Contact;
import com.digitalinnovationone.webstore.domain.model.base.PersonalData;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;

@Entity(name = "tb_users")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Column(unique = true)
	private Account account;
	
	@NotEmpty
	@Column(name = "personal_data")
	private PersonalData personal_data;
	
	@NotEmpty
	private Contact contact;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public @NotEmpty Account getAccount() {
		return account;
	}
	
	public void setAccount(@NotEmpty Account account) {
		this.account = account;
	}
	
	public @NotEmpty PersonalData getPersonal_data() {
		return personal_data;
	}
	
	public void setPersonal_data(@NotEmpty PersonalData personal_data) {
		this.personal_data = personal_data;
	}
	
	public @NotEmpty Contact getContact() {
		return contact;
	}
	
	public void setContact(@NotEmpty Contact contact) {
		this.contact = contact;
	}
}