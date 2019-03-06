package com.ufanisisavinggroup.springbootcrud.service;

import com.ufanisisavinggroup.springbootcrud.domain.Contact;

public interface ContactService {
    Iterable<Contact> getAllContacts();
    Contact getContactById(Integer id);
    Contact saveContact(Contact contact);
    void deleteContact(Integer id);
}
