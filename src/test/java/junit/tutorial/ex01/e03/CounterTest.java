package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

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
	void test1() {
		Counter counter = new Counter();
		int answer = counter.increment();
		assertEquals(1, answer);

	}

	@Test
	void test2() {
		Counter counter = new Counter();
		counter.increment();
		int answer = counter.increment();
		assertEquals(2, answer);

	}

	@Test
	void test3() {
		Counter counter = new Counter();

		for (int i = 1; i <= 50; i++) {

			counter.increment();
		}
		int answer = counter.increment();
		assertEquals(51, answer);
	}
}
