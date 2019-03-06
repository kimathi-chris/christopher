package com.ufanisisavinggroup.springbootcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufanisisavinggroup.springbootcrud.domain.Contribution;
import com.ufanisisavinggroup.springbootcrud.repository.ContributionRepository;

@Service
public class ContributionServiceImpl implements ContributionService {

    private ContributionRepository contributionRepository;
    
    @Autowired
    public void setContactRepository(ContributionRepository contributionRepository) {
        this.contributionRepository = contributionRepository;
    }
    
    @Override
    public Iterable<Contribution> getAllContribution() {
        return this.contributionRepository.findAll();
    }
    
    @Override
    public Contribution getContributiontById(Integer id) {
        return this.contributionRepository.findOne(id);
    }
    
    @Override
    public Contribution saveContribution(Contribution contribution) {
        return this.contributionRepository.save(contribution);
    }
    
    @Override
    public void deleteContribution(Integer id) {
        this.contributionRepository.delete(id);
    

    }

	
}
