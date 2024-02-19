package com.app.service;

import java.util.List;

import com.app.pojos.Attendance;

public interface AttendanceService 
{
  List<Attendance> getlistAttendances();
  Attendance getAttendance(long id);
  Attendance addAttendance(Attendance attendance);
  String deleteAttendance(long id);
  Attendance updateAttendance(Attendance attendance,long id);
}
