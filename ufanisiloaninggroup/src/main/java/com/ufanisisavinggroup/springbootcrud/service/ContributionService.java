package com.ufanisisavinggroup.springbootcrud.service;

import com.ufanisisavinggroup.springbootcrud.domain.Contribution;

public interface ContributionService {
    Iterable<Contribution> getAllContribution();
    Contribution getContributiontById(Integer id);
    Contribution saveContribution(Contribution Contribution);
    void deleteContribution(Integer id);
	
}
