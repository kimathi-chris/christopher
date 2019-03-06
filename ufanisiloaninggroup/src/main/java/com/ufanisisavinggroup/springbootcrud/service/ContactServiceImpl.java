package com.ufanisisavinggroup.springbootcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufanisisavinggroup.springbootcrud.domain.Contact;
import com.ufanisisavinggroup.springbootcrud.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    private ContactRepository contactRepository;
    
    @Autowired
    public void setContactRepository(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    
    @Override
    public Iterable<Contact> getAllContacts() {
        return this.contactRepository.findAll();
    }
    
    @Override
    public Contact getContactById(Integer id) {
        return this.contactRepository.findOne(id);
    }
    
    @Override
    public Contact saveContact(Contact contact) {
        return this.contactRepository.save(contact);
    }
    
    @Override
    public void deleteContact(Integer id) {
        this.contactRepository.delete(id);
    }
    
}
