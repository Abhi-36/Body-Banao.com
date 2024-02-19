package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Attendance;

public interface AttendanceRepo extends JpaRepository<Attendance, Long> {

}
