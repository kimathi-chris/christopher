package com.ufanisisavinggroup.springbootcrud.service;

import com.ufanisisavinggroup.springbootcrud.domain.LoanApplication;

public interface LoanApplicationService {
    Iterable<LoanApplication> getAllLoanApplications();
    LoanApplication saveLoanApplication(LoanApplication loanApplication);
    void deleteLoanApplication(Integer id);
    LoanApplication getLoanApplicationById(Integer id);
	
}
