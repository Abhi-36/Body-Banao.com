package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Member;
import com.app.service.MemberService;

@RestController
@RequestMapping("/member")
public class MemberController 
{
  @Autowired
  private MemberService memeservice;
  
  @PostMapping("/addmember")
  public ResponseEntity<Member> addMembers(@RequestBody Member member)
  {
	  return ResponseEntity.ok(memeservice.addMember(member));
  }
  
  @GetMapping("/getmember/{id}")
  public ResponseEntity<Member> getmemberbyid(@PathVariable long id)
  {
	  return ResponseEntity.ok(memeservice.getMember(id));
  }
  
  @GetMapping("/getmemberlist")
  public ResponseEntity< List<Member>> getAllmember()
  {
	  return ResponseEntity.ok(memeservice.getlistMembers());
  }
  
  @DeleteMapping("/deleteMember/{id}")
  public ResponseEntity<String> deletemember(@PathVariable long id)
  {
	  return ResponseEntity.ok(memeservice.deleteMember(id));
  }
  
  @PutMapping("/updatemember/{id}")
  public ResponseEntity<Member> updatemember(@RequestBody Member member,@PathVariable long id)
  {
	  return ResponseEntity.ok(memeservice.updateMember(member, id));
  }
}
