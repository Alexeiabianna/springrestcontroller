package br.pucrs.engswii.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.Student;
import br.pucrs.engswii.beans.StudentRegistration;

@RestController
public class StudentRetrieveController {

	//	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	//
	//	@ResponseBody
	@GetMapping("/student/allstudent")
	public List<Student> getAllStudents() {
		return StudentRegistration.getInstance().getStudentRecords();
	}

}
