package com.ufanisisavinggroup.springbootcrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufanisisavinggroup.springbootcrud.domain.LoanRepayment;
import com.ufanisisavinggroup.springbootcrud.repository.LoanRepaymentRepository;

@Service
public class LoanRepaymentServiceImpl implements LoanRepaymentService {

    private LoanRepaymentRepository loanRepaymentRepository;
    
    @Autowired
    public void setLoanRepaymentRepository(LoanRepaymentRepository loanRepaymentRepository) {
        this.loanRepaymentRepository = loanRepaymentRepository;
    }
    

	@Override
	public Iterable<LoanRepayment> getAllLoanRepayments() {
		
		return this.loanRepaymentRepository.findAll();
	}

	@Override
	public LoanRepayment getLoanRepaymentById(Integer id) {		
		return this.loanRepaymentRepository.findOne(id);
	}

	@Override
	public LoanRepayment saveLoanRepayment(LoanRepayment loanRepayment) {		
		return this.loanRepaymentRepository.save(loanRepayment);
	}

	@Override
	public void deleteLoanRepayment(Integer id) {
		this.loanRepaymentRepository.delete(id);
		
	}
    
}
