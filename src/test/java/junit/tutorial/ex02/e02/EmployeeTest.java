package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		InputStream stream = getClass().getResourceAsStream("Employee.txt");


		List<Employee> empList = Employee.load(stream);

		String firstName = empList.get(0).getFirstName();
		String lastName = empList.get(0).getLastName();
		String email = empList.get(0).getEmail();

		assertAll("person", () -> assertEquals("Ichiro", firstName), () -> assertEquals("Tanaka", lastName),
				() -> assertEquals("ichiro@example.com", email));

	}

}
