package com.ufanisisavinggroup.springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.ufanisisavinggroup.springbootcrud.domain.LoanApplication;

public interface LoanApplicationRepository extends CrudRepository<LoanApplication, Integer>{
    
}
