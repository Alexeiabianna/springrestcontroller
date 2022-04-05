package br.pucrs.engswii.controllers;

//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.StudentRegistration;

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
		return StudentRegistration.getInstance().deleteStudent(regdNum);
	}

}
