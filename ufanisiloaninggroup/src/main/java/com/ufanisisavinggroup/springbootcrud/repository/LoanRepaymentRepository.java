package com.ufanisisavinggroup.springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.ufanisisavinggroup.springbootcrud.domain.LoanRepayment;

public interface LoanRepaymentRepository extends CrudRepository<LoanRepayment, Integer>{
    
}
