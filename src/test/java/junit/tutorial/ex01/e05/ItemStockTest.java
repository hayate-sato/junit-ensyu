package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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
		ItemStock itemstock = new ItemStock();
		Item item = new Item("俺", 380);
		int answer = itemstock.getNum(item);
		assertEquals(0, answer);

	}

	@Test
	void test2() {
		ItemStock itemstock = new ItemStock();
		Item item = new Item("俺", 380);
		itemstock.add(item);
		int answer = itemstock.getNum(item);

		assertEquals(1, answer);

	}

	@Test
	void test3() {
		ItemStock itemstock = new ItemStock();
		Item item = new Item("俺", 380);
		itemstock.add(item);
		itemstock.add(item);
		int answer = itemstock.getNum(item);

		assertEquals(2, answer);

	}

	@Test
	void test4() {
		ItemStock itemstock = new ItemStock();
		Item item1 = new Item("俺", 380);
		Item item2 = new Item("水筒", 2800);
		itemstock.add(item1);
		itemstock.add(item2);
		int answer = itemstock.getNum(item1);

		assertEquals(1, answer);

	}
}
