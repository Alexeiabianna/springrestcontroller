package br.pucrs.engswii.controllers.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.student.Student;
import br.pucrs.engswii.beans.student.StudentRegistration;

@RestController
public class StudentRetrieveByRegistrationNumberController {
	
	@GetMapping("/student/regsearch/{regdNum}")
	public Student getStudentByRegistration(@PathVariable("regdNum") String regdNum) {
		return StudentRegistration.getInstance().getStudentByRegistration(regdNum);
	}

}