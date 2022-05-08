package br.pucrs.engswii.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.Student;
import br.pucrs.engswii.beans.StudentRegistration;

@RestController
public class StudentRetrieveByRegistrationNumberController {

	//	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	//
	//	@ResponseBody
	@GetMapping("/student/regsearch/{regdNum}")
	public Student getStudentByRegistration(@PathVariable("regdNum") String regdNum) {
		return StudentRegistration.getInstance().getStudentByRegistration(regdNum);
	}

}