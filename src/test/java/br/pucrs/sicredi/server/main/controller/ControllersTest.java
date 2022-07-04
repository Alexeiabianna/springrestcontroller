package br.pucrs.sicredi.server.main.controller;

import org.junit.jupiter.api.Test;

public class ControllersTest {
    /*
		Sugestões de teste:
		Delete - StudentDeleteController
		Post   - UserRegistrationController
		Post   - DisciplinesRegistrationController
		Put    - StudentUpdateController
		Get    - UserRetrieveController
	*/

	@Test
	@Test
	@Test
	@Test
	@Test

	/* EXEMPLO PROFESSOR
	@Test
	public void createStudentCourse() throws Exception {
		Course mockCourse = new Course("1", "Smallest Number", "1",
				Arrays.asList("1", "2", "3", "4"));

		// studentService.addCourse to respond back with mockCourse
		Mockito.when(
				studentService.addCourse(Mockito.anyString(),
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
    */
}
