package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Member;

public interface MemberRepo extends JpaRepository<Member , Long>
{

}
