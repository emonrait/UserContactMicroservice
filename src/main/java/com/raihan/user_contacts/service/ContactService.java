package com.raihan.user_contacts.service;

import java.util.List;

import com.raihan.user_contacts.model.Contact;

public interface ContactService {
	
	public List<Contact> getContactofUser(Long userId);

}
