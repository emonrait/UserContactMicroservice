package com.raihan.user_contacts.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.raihan.user_contacts.model.Contact;

@Service
public class ContactServiceImpl implements ContactService{
	
	List<Contact>list=List.of(
			new Contact(1L,"Raihan","emonrait@gmail.com",1001L),
			new Contact(2L,"Raihan","emonrait@gmail.com",1001L),
			new Contact(3L,"Raihan","emonrait@gmail.com",1002L),
			new Contact(4L,"Raihan","emonrait@gmail.com",1003L),
			new Contact(5L,"Raihan","emonrait@gmail.com",1004L)
			
			);

	@Override
	public List<Contact> getContactofUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
