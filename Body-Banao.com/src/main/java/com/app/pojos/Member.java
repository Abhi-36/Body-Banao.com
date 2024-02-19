package com.app.pojos;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="member")
public class Member extends BaseEntity
{
  private String fullname;
  private String email;
  private String phonenumber;
  private Date dob;
  private Date joindate;
  private GenderType gender;
  private String address;
  
  @OneToMany(mappedBy =  "members",cascade = CascadeType.ALL,orphanRemoval = true, fetch = FetchType.LAZY)
  private List<Attendance> member_attendance;

 @OneToOne(mappedBy ="member",cascade = CascadeType.ALL , orphanRemoval = true,fetch =FetchType.LAZY)
 private Subscription subscription;
 
 
public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhonenumber() {
	return phonenumber;
}

public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

public Date getJoindate() {
	return joindate;
}

public void setJoindate(Date joindate) {
	this.joindate = joindate;
}

public GenderType getGender() {
	return gender;
}

public void setGender(GenderType gender) {
	this.gender = gender;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public Subscription getSubscription() {
	return subscription;
}

public void setSubscription(Subscription subscription) {
	this.subscription = subscription;
}

public List<Attendance> getMember_attendance() {
	return member_attendance;
}

public void setMember_attendance(List<Attendance> member_attendance) {
	this.member_attendance = member_attendance;
}

public Member(String fullname, String email, String phonenumber, Date dob, Date joindate, GenderType gender,
		String address, Subscription subscription, List<Attendance> member_attendance) {
	super();
	this.fullname = fullname;
	this.email = email;
	this.phonenumber = phonenumber;
	this.dob = dob;
	this.joindate = joindate;
	this.gender = gender;
	this.address = address;
	this.subscription = subscription;
	this.member_attendance = member_attendance;
}

public Member() {
	super();
}

@Override
public String toString() {
	return "Member [fullname=" + fullname + ", email=" + email + ", phonenumber=" + phonenumber + ", dob=" + dob
			+ ", joindate=" + joindate + ", gender=" + gender + ", address=" + address + ", subscription="
			+ subscription + ", member_attendance=" + member_attendance + "]";
}
 


    
 
}
