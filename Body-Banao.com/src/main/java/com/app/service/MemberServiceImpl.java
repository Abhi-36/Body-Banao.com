package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Exception.CustomException;
import com.app.pojos.Member;
import com.app.repository.MemberRepo;

@Service
@Transactional
public class MemberServiceImpl implements MemberService
{
    @Autowired
    private MemberRepo memberrepo;
	
	@Override
	public List<Member> getlistMembers() {
		List<Member> member=memberrepo.findAll();
		return member;
	}

	@Override
	public Member getMember(long id) {
		Member member=memberrepo.findById(id).orElseThrow(()-> new CustomException("id is Wrong please enter correct id"));
		return member;
	}

	@Override
	public Member addMember(Member member) {
		Member member1=memberrepo.save(member);
		return member1;
	}

	@Override
	public String deleteMember(long id) {
		Member member=memberrepo.findById(id).orElseThrow(()-> new CustomException("id is Wrong please enter correct id"));
		memberrepo.delete(member);
		return "Member is deleted";
	}

	@Override
	public Member updateMember(Member member, long id) {
		
		Member member1=memberrepo.findById(id).orElseThrow(()-> new CustomException("id is Wrong please enter correct id"));
		member1.setAddress(member.getAddress());
		member1.setDob(member.getDob());
		member1.setEmail(member.getEmail());
		member1.setFullname(member.getFullname());
		member1.setGender(member.getGender());
		member1.setJoindate(member.getJoindate());
		member1.setPhonenumber(member.getPhonenumber());
		member1.setMember_attendance(member.getMember_attendance());
		member1.setSubscription(member.getSubscription());
		
		Member member2=memberrepo.save(member1);
		return member2;
	}

}
