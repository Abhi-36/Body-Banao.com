package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.Exception.CustomException;
import com.app.pojos.Attendance;
import com.app.repository.AttendanceRepo;

@Service
@Transactional
public class AttendanceServiceImpl implements AttendanceService
{
	@Autowired
	private AttendanceRepo attenrepo;

	@Override
	public List<Attendance> getlistAttendances() {
		List<Attendance> attendance=attenrepo.findAll();
		return attendance;
	}

	@Override
	public Attendance getAttendance(long id) {
		Attendance attendance=attenrepo.findById(id).orElseThrow(()-> new CustomException("id is wrong please enter a correct id"));
		return attendance;
	}

	@Override
	public Attendance addAttendance(Attendance attendance) {
		Attendance attendance1=attenrepo.save(attendance);
		return attendance1;
	}

	@Override
	public String deleteAttendance(long id) {
		Attendance attendance=attenrepo.findById(id).orElseThrow(()-> new CustomException("id is wrong please enter a correct id"));
		attenrepo.delete(attendance);
		return "attedndance is deleted";
	}

	@Override
	public Attendance updateAttendance(Attendance attendance, long id) {
		Attendance attendance1=attenrepo.findById(id).orElseThrow(()-> new CustomException("id is wrong please enter a correct id"));
		
		attendance1.setCheckin_time(attendance.getCheckin_time());
		attendance1.setCheckout_time(attendance.getCheckout_time());
		attendance1.setMembers(attendance.getMembers());
		
		Attendance attendance2=attenrepo.save(attendance1);
		return attendance2;
	}

}
