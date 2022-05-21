package br.pucrs.engswii.controllers.student;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.student.Student;
import br.pucrs.engswii.beans.student.StudentRegistration;
import br.pucrs.engswii.beans.student.StudentRegistrationReply;
import br.pucrs.engswii.beans.user.UserRegistration;

@RestController
public class StudentRegistrationController {

	@PostMapping("register/student")
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
