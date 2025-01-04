package com.tekbasic.Username;
import java.util.List;
import com.tekbasic.Bo.Book;

import javax.persistence.CascadeType;
import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="username") 
	private String username;
	@Column (name="password") 
	private String password;
	@Column (name="email") 
	private String email;
	@Column(name="phone") 
	private String phone;
	@Column (name="place") 
	private String place;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;
    

	 public User(String username, String password, String email, String phone, String place) {
	  super();
	  this.username = username;
	  this.password = password;
	  this.email = email;
	  this.phone = phone;
	  this.place = place;
	 }

	 public int getId() {
	  return id;
	 }

	 public void setId(int id) {
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

	 public String getEmail() {
	  return email;
	 }

	 public void setEmail(String email) {
	  this.email = email;
	 }
	 public String getPhone() {
		 return phone;
	 }
	 public void setPhone(String phone) {
		 this.phone = phone;
	 }
	 public String getPlace() {
		 return place;
	 }

	 @Override
	 public String toString() {
	  return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", phone=" + phone + ", place=" + place + "]"; 

	 }

	}