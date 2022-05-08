package br.pucrs.engswii.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.Student;
import br.pucrs.engswii.beans.StudentRegistration;

@RestController
public class StudentRetrieveByNameSegment {
    @GetMapping("/student/namesearch/{nameSegment}")
	public List<Student> getStudentsByNameSegment(@PathVariable("nameSegment") String nameSegment) {
		return StudentRegistration.getInstance().getStudentsByNameSegment(nameSegment);
	}
}
