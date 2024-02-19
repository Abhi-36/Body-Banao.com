package com.app.pojos;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="attendance")
public class Attendance extends BaseEntity
{
     private Date checkin_time;
     private Date checkout_time;
     
     @ManyToOne(cascade = CascadeType.ALL,fetch =FetchType.LAZY)
     @JoinColumn(name="member_id")
     private Member members;

	public Attendance(Date checkin_time, Date checkout_time, Member members) {
		super();
		this.checkin_time = checkin_time;
		this.checkout_time = checkout_time;
		this.members = members;
	}

	public Attendance() {
		super();
	}

	@Override
	public String toString() {
		return "Member_Attendance [checkin_time=" + checkin_time + ", checkout_time=" + checkout_time + ", members="
				+ members + "]";
	}

	public Date getCheckin_time() {
		return checkin_time;
	}

	public void setCheckin_time(Date checkin_time) {
		this.checkin_time = checkin_time;
	}

	public Date getCheckout_time() {
		return checkout_time;
	}

	public void setCheckout_time(Date checkout_time) {
		this.checkout_time = checkout_time;
	}

	public Member getMembers() {
		return members;
	}

	public void setMembers(Member members) {
		this.members = members;
	}
     
     
}
