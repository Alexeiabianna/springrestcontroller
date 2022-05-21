package br.pucrs.engswii.controllers.student;

import java.util.List;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.*;
import br.pucrs.engswii.beans.student.Student;
import br.pucrs.engswii.beans.student.StudentRegistration;
import br.pucrs.engswii.beans.student.StudentRegistrationReply;
import br.pucrs.engswii.beans.user.UserRegistration;

@RestController("register")
public class StudentRegistrationController {

	//  @RequestMapping(method = RequestMethod.POST, value="/register/student")
	//
	//  @ResponseBody
	@PostMapping("/student")
	public StudentRegistrationReply registerStudent(@RequestBody Student student) {
		System.out.println("In registerStudent");
		StudentRegistrationReply stdregreply = new StudentRegistrationReply();
		if(UserRegistration.getInstance().isLogged().equals("Validation successful")){
			StudentRegistration.getInstance().add(student);
			stdregreply.setName(student.getName());
			stdregreply.setAge(student.getAge());
			stdregreply.setRegistrationNumber(student.getRegistrationNumber());
			stdregreply.setRegistrationStatus("Successful");
		}
		else{
			stdregreply.setRegistrationStatus(UserRegistration.getInstance().isLogged()); //retorna "Validation un-successful"
		}
		return stdregreply;
	}

}
