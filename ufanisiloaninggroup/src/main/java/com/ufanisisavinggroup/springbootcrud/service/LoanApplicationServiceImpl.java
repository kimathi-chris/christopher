package com.ufanisisavinggroup.springbootcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufanisisavinggroup.springbootcrud.domain.LoanApplication;
import com.ufanisisavinggroup.springbootcrud.repository.LoanApplicationRepository;

@Service
public class LoanApplicationServiceImpl implements LoanApplicationService {

    private LoanApplicationRepository loanApplicationRepository;
    
    @Autowired
    public void setLoanApplicationRepository(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }
    

	@Override
	public Iterable<LoanApplication> getAllLoanApplications() {
		
		return this.loanApplicationRepository.findAll();
	}

	@Override
	public LoanApplication getLoanApplicationById(Integer id) {		
		return this.loanApplicationRepository.findOne(id);
	}

	@Override
	public LoanApplication saveLoanApplication(LoanApplication loanApplication) {		
		return this.loanApplicationRepository.save(loanApplication);
	}

	@Override
	public void deleteLoanApplication(Integer id) {
		this.loanApplicationRepository.delete(id);
		
	}
    
}
