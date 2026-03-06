package com;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Customer_Information")
public class Book {
		@Id
		@Column(name= "Customer_Id")
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private int id;
		@Column(name="Customer_Name",nullable=false)
		private String name;
		@Column(name="Customer_Email",nullable=false,unique=true)
		private String email;
		@Column(name="Customer_Gender",nullable=false)
		private String gender;
		@Column(name="Mobile_Number",nullable=false,unique=true,length=10)
		private long mobileno;
		public Book() {
			
}
	public Book(int id, String name, String email, String gender, long mobileno) {
			this.id = id;
			this.name = name;
			this.email = email;
			this.gender = gender;
			this.mobileno = mobileno;
		}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	@Override
	public String toString() {
		return "UserInformation [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", mobileno="
				+ mobileno + "]";
	}

	}
