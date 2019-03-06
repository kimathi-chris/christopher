package com.ufanisisavinggroup.springbootcrud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty(message = "Last Name is required.")
    @Size(min = 2, message = "Last Name must be at least 2 characters.")
    private String lastName;
    @NotEmpty(message = "First Name is required.")
    @Size(min = 2, message = "First Name must be at least 2 characters.")
    private String firstName;
    @Column(name = "amount_applied")
    @Size(max = 11, message = "")
    private String Amount_Applied;
    @Column(name = "amount_approved")
    @Size(max = 11, message = "")
    private String Amount_Approved;
    @NotEmpty(message = "loan for.. is required.")
    private String Loan_for;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getAmountApplied() {
		return Amount_Applied;
	}
	public void setAmountApplied(String amountApplied) {
		Amount_Applied = amountApplied;
	}
	public String getAmountApproved() {
		return Amount_Approved;
	}
	public void setAmountApproved(String amountApproved) {
		Amount_Approved = amountApproved;
	}
	public String getLoan_for() {
		return Loan_for;
	}
	public void setLoan_for(String loan_for) {
		Loan_for = loan_for;
	}

  
}
