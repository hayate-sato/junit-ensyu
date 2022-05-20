package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonthlyCalendarTest {

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
		LocalDate localDate = LocalDate.of(2012, 1, 31);
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(localDate);
		
		int answer = monthlyCalendar.getRemainingDays();
		assertEquals(0, answer,"エラー　テスト結果の失敗");
	}

	@Test
	void test2() {
		LocalDate localDate = LocalDate.of(2012, 1, 30);
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(localDate);

		int answer = monthlyCalendar.getRemainingDays();
		assertEquals(1, answer, "エラー　テスト結果の失敗");
	}

	@Test
	void test3() {
		LocalDate localDate = LocalDate.of(2012, 2, 1);
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(localDate);

		int answer = monthlyCalendar.getRemainingDays();
		assertEquals(28, answer, "エラー　テスト結果の失敗");
	}

}
