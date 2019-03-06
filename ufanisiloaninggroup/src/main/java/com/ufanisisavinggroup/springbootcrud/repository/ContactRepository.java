package com.ufanisisavinggroup.springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.ufanisisavinggroup.springbootcrud.domain.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer>{
    
}
