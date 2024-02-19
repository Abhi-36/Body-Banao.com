package com.app.service;

import java.util.List;

import com.app.pojos.Member;

public interface MemberService 
{
	List<Member> getlistMembers();
	  Member getMember(long id);
	  Member addMember(Member member);
	  String deleteMember(long id);
	  Member updateMember(Member member,long id);
}
