package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAllが呼び出されました");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAllが呼び出されました");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEachが呼び出されました");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEachが呼び出されました");
	}

	@Test
	void test() {
		Calculator calc = new Calculator();

		assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));

	}
}
