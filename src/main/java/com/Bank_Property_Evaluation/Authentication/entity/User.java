package com.Bank_Property_Evaluation.Authentication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(unique = true)
	    private String username;
	    
	    private String password;
	    
	    private String initiatorName;
	    
	    private String businessUnit;
	    
	    private String contactNumber;

		public User(Long id2, String businessUnit2, String initiatorName2, String contactNumber2) {
			// TODO Auto-generated constructor stub
		}
		public User() {
			
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getInitiatorName() {
			return initiatorName;
		}

		public void setInitiatorName(String initiatorName) {
			this.initiatorName = initiatorName;
		}

		public String getBusinessUnit() {
			return businessUnit;
		}

		public void setBusinessUnit(String businessUnit) {
			this.businessUnit = businessUnit;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
}
