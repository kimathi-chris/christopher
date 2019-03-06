package com.ufanisisavinggroup.springbootcrud.service;

import com.ufanisisavinggroup.springbootcrud.domain.LoanRepayment;

public interface LoanRepaymentService {
    Iterable<LoanRepayment> getAllLoanRepayments();
    LoanRepayment saveLoanRepayment(LoanRepayment loanRepayment);
    LoanRepayment getLoanRepaymentById(Integer id);
    void deleteLoanRepayment(Integer id);
	
}
