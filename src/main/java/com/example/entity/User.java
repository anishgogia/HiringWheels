package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User1")
public class User {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@OneToMany(mappedBy="user_id")
	private int id;
	String firstname;
	private String password;
	String lastname;
	String email;
	String phn;
//	@ManyToOne(fetch=FetchType.LAZY)
	int role_id;
	int wallet_money;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", password=" + password + ", lastname=" + lastname
				+ ", email=" + email + ", phn=" + phn + ", role_id=" + role_id + ", wallet_money=" + wallet_money + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getWallet_money() {
		return wallet_money;
	}
	public void setWallet_money(int wallet_money) {
		this.wallet_money = wallet_money;
	}
	

}
