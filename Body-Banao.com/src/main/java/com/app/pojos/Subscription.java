package com.app.pojos;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="susbcription")
public class Subscription extends BaseEntity
{
  private Date startdate;
  private Date enddate;
  private MembershipType membertype;
  private double monthlyfee;
  
  @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
  @JoinColumn(name="member_id" )
  private Member member;

public Subscription(Date startdate, Date enddate, MembershipType membertype, double monthlyfee, Member member) {
	super();
	this.startdate = startdate;
	this.enddate = enddate;
	this.membertype = membertype;
	this.monthlyfee = monthlyfee;
	this.member = member;
}

public Date getStartdate() {
	return startdate;
}

public void setStartdate(Date startdate) {
	this.startdate = startdate;
}

public Date getEnddate() {
	return enddate;
}

public void setEnddate(Date enddate) {
	this.enddate = enddate;
}

public MembershipType getMembertype() {
	return membertype;
}

public void setMembertype(MembershipType membertype) {
	this.membertype = membertype;
}

public double getMonthlyfee() {
	return monthlyfee;
}

public void setMonthlyfee(double monthlyfee) {
	this.monthlyfee = monthlyfee;
}

public Member getMember() {
	return member;
}

public void setMember(Member member) {
	this.member = member;
}

public Subscription() {
	super();
}

@Override
public String toString() {
	return "Subscription [startdate=" + startdate + ", enddate=" + enddate + ", membertype=" + membertype
			+ ", monthlyfee=" + monthlyfee + ", member=" + member + "]";
}
  
  
  
  
}
