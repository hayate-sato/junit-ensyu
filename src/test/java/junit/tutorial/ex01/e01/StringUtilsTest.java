package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

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
	void testToSnakeCase() {
		String answer = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", answer, "エラー　aaaの失敗");
	}

	@Test
	void testToSnakeCase2() {
		String answer = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", answer, "エラー　hello_worldの失敗");
	}

	@Test
	void testToSnakeCase3() {
		String answer = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", answer, "エラー　practice_junitの失敗");
	}

}
