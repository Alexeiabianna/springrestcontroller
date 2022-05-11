package br.pucrs.engswii.beans.student;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {

	private List<Student> studentRecords;

	private static StudentRegistration stdregd = null;

	private StudentRegistration(){
		studentRecords = new ArrayList<Student>();
	}

	public static StudentRegistration getInstance() {

		if(stdregd == null) {
			stdregd = new StudentRegistration();
			return stdregd;
		}
		else {
			return stdregd;
		}
	}

	public void add(Student std) {
		studentRecords.add(std);
	}

	public String upDateStudent(Student std) {

		for(int i=0; i<studentRecords.size(); i++)
		{
			Student stdn = studentRecords.get(i);
			if(stdn.getRegistrationNumber().equals(std.getRegistrationNumber())) {
				studentRecords.set(i, std);//update the new record
				return "Update successful";
			}
		}

		return "Update un-successful";
	}

	public String deleteStudent(String registrationNumber) {

		for(int i=0; i<studentRecords.size(); i++)
		{
			Student stdn = studentRecords.get(i);
			if(stdn.getRegistrationNumber().equals(registrationNumber)){
				studentRecords.remove(i);//update the new record
				return "Delete successful";
			}
		}

		return "Delete un-successful";
	}

	public List<Student> getStudentRecords() {
		return studentRecords;
	}
	
	public Student getStudentByRegistration(String regdNum) {
		for (Student student : studentRecords) {
			if (regdNum.equals(student.getRegistrationNumber())) {
				return student;
			}
		}
		return null;
	}

	public List<Student> getStudentsByNameSegment(String nameSegment) {
		List<Student> resultedStudents = new ArrayList<>();
		for (Student student : studentRecords) {
			if (student.getName().contains(nameSegment)) {
				resultedStudents.add(student);
			}
		}
		return resultedStudents;
	}

}
