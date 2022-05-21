package br.pucrs.engswii.controllers.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.student.Student;
import br.pucrs.engswii.beans.student.StudentRegistration;
import br.pucrs.engswii.beans.user.UserRegistration;

@RestController
public class StudentRetrieveController {

	//	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	//
	//	@ResponseBody
	@GetMapping("/student/allstudent")
	public List<Student> getAllStudents() {
		if(UserRegistration.getInstance().isLogged().equals("Validation successful")){
			return StudentRegistration.getInstance().getStudentRecords();
		}
		Student std = new Student(); // Cria um aluno pra representar a validacao
		std.setName("Validation un-successful");
		List<Student> list = new ArrayList<Student>();
		list.add(std);
		return list; //retorna "Validation un-successful"
	}

}