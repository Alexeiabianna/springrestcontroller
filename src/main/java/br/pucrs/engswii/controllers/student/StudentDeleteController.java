package br.pucrs.engswii.controllers.student;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.student.StudentRegistration;
import br.pucrs.engswii.beans.user.UserRegistration;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class StudentDeleteController {

//	@RequestMapping(method = RequestMethod.DELETE, value="/delete/student/{regdNum}")
//
//	@ResponseBody
	@DeleteMapping("/delete/student/{regdNum}")
	public String deleteStudentRecord(@PathVariable("regdNum") String regdNum) {
		System.out.println("In deleteStudentRecord");   
		if(UserRegistration.getInstance().isLogged().equals("Validation successful")){
			return StudentRegistration.getInstance().deleteStudent(regdNum);
		}
		return UserRegistration.getInstance().isLogged(); //retorna "Validation un-successful"
	}

}
