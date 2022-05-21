package br.pucrs.engswii.controllers.student;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.student.Student;
import br.pucrs.engswii.beans.student.StudentRegistration;
import br.pucrs.engswii.beans.user.UserRegistration;

@RestController
public class StudentUpdateController {

//	@RequestMapping(method = RequestMethod.PUT, value="/update/student")
//
//
//	@ResponseBody
	@PutMapping("/update/student")
	public String updateStudentRecord(@RequestBody Student stdn) {
		System.out.println("In updateStudentRecord");   
		if(UserRegistration.getInstance().isLogged().equals("Validation successful")){
			return StudentRegistration.getInstance().upDateStudent(stdn);
		}		
		return UserRegistration.getInstance().isLogged(); //retorna "Validation un-successful"
	}

}
