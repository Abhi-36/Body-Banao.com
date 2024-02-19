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

import com.app.pojos.Attendance;
import com.app.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
public class AttendanceController
{
  @Autowired
  private AttendanceService attendservice;
  
  @PostMapping("/addAttendance")
  public ResponseEntity<Attendance> addattendances(@RequestBody Attendance attendance)
  {
	  return ResponseEntity.ok(attendservice.addAttendance(attendance));
  }
  
  @GetMapping("/getAttendance/{id}")
  public ResponseEntity<Attendance> getAttendance(@PathVariable long id)
  {
	  return ResponseEntity.ok(attendservice.getAttendance(id));
  }
  
  @GetMapping("/getAttedancelist")
  public ResponseEntity<List<Attendance>> getAttendancelist()
  {
	  return ResponseEntity.ok(attendservice.getlistAttendances());
  }
  
  @DeleteMapping("/deleteAttendance/{id}")
  public ResponseEntity<String> deleteAttendance(@PathVariable long id)
  {
	  return ResponseEntity.ok(attendservice.deleteAttendance(id));
  }
  
  @PutMapping
  public ResponseEntity<Attendance> updateAttendance(@RequestBody Attendance attendance,@PathVariable long id)
  {
	  return ResponseEntity.ok(attendservice.updateAttendance(attendance, id));
  }
}
