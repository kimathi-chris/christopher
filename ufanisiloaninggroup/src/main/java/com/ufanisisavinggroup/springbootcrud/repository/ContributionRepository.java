package com.ufanisisavinggroup.springbootcrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.ufanisisavinggroup.springbootcrud.domain.Contribution;

public interface ContributionRepository extends CrudRepository<Contribution, Integer>{
    
}
