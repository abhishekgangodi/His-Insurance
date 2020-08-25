package com.abhishekit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name = "ACCOUNT_REGISTRATION")
public class AccountRegistrationEntity {
	
	@Id
	@Column(name="ACCOUNT_ID")
	Integer acId;

	@Column(name = "FIRST_NAME")
	String firstName;
	
	@Column(name = "LAST_NAME")
	String lastName;
	
	@Column(name = "EMAIL")
	String email;
	
	@Column(name="GENDER")
	String gender;
	
	@Column(name = "ROLE")
	String role;
	
	@Column(name="LOCK_STATUS")
	String lockStatus;
	
	@Column(name="DELETE_SW")
	String deleteStatus;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE",updatable=false)
	Date createdDate;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DATE",insertable=false)
	Date updatedDate;

}
