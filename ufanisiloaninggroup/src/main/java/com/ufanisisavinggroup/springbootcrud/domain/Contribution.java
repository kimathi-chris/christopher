package com.ufanisisavinggroup.springbootcrud.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Contribution {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty(message = "Last Name is required.")
    @Size(min = 2, message = "Last Name must be at least 2 characters.")
    private String lastName;
    @NotEmpty(message = "First Name is required.")
    @Size(min = 2, message = "First Name must be at least 2 characters.")
    private String firstName;
    @Column(name = "amount")
    @Size(min = 4, message = "")
    private String amount; 
    @NotEmpty(message = "what is the contribution for??")
    private String contribution_for;
   
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
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getContribution_for() {
		return contribution_for;
	}
	public void setContribution_for(String contribution_for) {
		this.contribution_for = contribution_for;
	}
	

  
}
