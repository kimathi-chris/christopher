package com.ufanisisavinggroup.springbootcrud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class LoanRepayment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty(message = "Last Name is required.")
    @Size(min = 2, message = "Last Name must be at least 2 characters.")
    private String lastName;
    @NotEmpty(message = "First Name is required.")
    @Size(min = 2, message = "First Name must be at least 2 characters.")
    private String firstName;
    @Column(name = "amount_paid")
    @Size(max = 11, message = "")
    private String Amount_Paid;
    @Column(name = "outstanding_amount")
    @Size(max = 11, message = "")
    private String Outstanding_Amount;
    @NotEmpty(message = "Paid for.. is required.")
    private String Paid_for;
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
	public String getAmount_Paid() {
		return Amount_Paid;
	}
	public void setAmount_Paid(String amount_Paid) {
		Amount_Paid = amount_Paid;
	}
	public String getOutstanding_Amount() {
		return Outstanding_Amount;
	}
	public void setOutstanding_Amount(String outstanding_Amount) {
		Outstanding_Amount = outstanding_Amount;
	}
	public String getPaid_for() {
		return Paid_for;
	}
	public void setPaid_for(String paid_for) {
		Paid_for = paid_for;
	}
	
    
}
