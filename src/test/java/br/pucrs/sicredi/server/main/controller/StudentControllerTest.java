package br.pucrs.sicredi.server.main.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import br.pucrs.engswii.beans.student.*;
import br.pucrs.engswii.controllers.student.*;

import br.pucrs.engswii.beans.discipline.*;
import br.pucrs.engswii.controllers.discipline.*;

import br.pucrs.engswii.beans.user.*;
import br.pucrs.engswii.controllers.user.*;

	/*
		Sugestões de teste:
		Neste arquivo: (StudentControllerTest)
			Delete - StudentDeleteController 
			Put    - StudentUpdateController
		Em DisciplineControllerTest:
			Post   - DisciplinesRegistrationController 
		Em UserControllerTest:
			Post   - UserRegistrationController
			Get    - UserRetrieveController
	*/

//@RunWith(SpringRunner.class)
//@WebMvcTest(value = StudentController.class, secure = false)
@WebMvcTest(value = Student.class)
public class StudentControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean   
	//private StudentRegistration studentRegistration;

	Student mockStudent = new Student("Student1", 20, "12345");
	String exampleStudentJson = "{\"name\":\"Student1\",\"age\":\"20\",\"registrationNumber\":\"12345\"}";
	
	Discipline mockDiscipline = new Discipline("12345-A", "Discipline1", "17h30 - 19h00");
	String exampleDisciplineJson = "{\"cod_disciplina\":\"12345-A\",\"nome_disciplina\":\"Discipline1\",\"horario_disciplina\":\"17h30 - 19h00\"}";
	
	User mockUser = new User("User1", "password", "12345", false);
	String exampleUserJson = "{ \"name\":\"User1\", \"password\":\"password\", \"registrationNumber\":\"12345\", \"status\" : \"false\"}";

//============================================================================

	@Test
	public void retrieveDetailsForCourse() throws Exception {

		Mockito.when(
				studentRegistration.retrieveCourse(Mockito.anyString(),
						Mockito.anyString())).thenReturn(mockCourse);

		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/students/Student1/courses/Course1").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "{id:Course1,name:Spring,description:10 Steps}";

		// {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}

//		assertEquals("meu json aqui", result.getResponse());
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
	}

	@Test
	public void createStudentCourse() throws Exception {
		Course mockCourse = new Course("1", "Smallest Number", "1",
				Arrays.asList("1", "2", "3", "4"));

		// studentService.addCourse to respond back with mockCourse
		Mockito.when(
				studentRegistration.addCourse(Mockito.anyString(),
						Mockito.any(Course.class))).thenReturn(mockCourse);

		// Send course as body to /students/Student1/courses
		RequestBuilder requestBuilder = MockMvcRequestBuilders
				.post("/students/Student1/courses")
				.accept(MediaType.APPLICATION_JSON).content(exampleCourseJson)
				.contentType(MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		MockHttpServletResponse response = result.getResponse();

		assertEquals(HttpStatus.CREATED.value(), response.getStatus());

		assertEquals("http://localhost/students/Student1/courses/1",
				response.getHeader(HttpHeaders.LOCATION));

	}

}
