import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import MyPackage.MyArrayList;

class TestMyArrayList {

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
	void IntTest() {
		MyArrayList<String> strArray = new MyArrayList<String>();	
		strArray.add("5");
		strArray.add("10");
		strArray.add("15");
		strArray.add("20");
		strArray.add("25");
		
		strArray.remove("25");
		System.out.println(strArray.get());
		String val1 = "20";
		
		assertEquals(strArray.get().get(3), val1);
	}
	
	@Test
	void AddTest() {
		MyArrayList<String> intArray = new MyArrayList<String>();	
		intArray.add("5");
		intArray.add("10");
		intArray.add("15");
		intArray.add("20");
		intArray.add("25");
		String svalString = "25";
		
		assertEquals(intArray.get().get(4), svalString);
	}
	
	@Test
	void RemoveTest() {
		MyArrayList<String> intArray = new MyArrayList<String>();	
		intArray.add("5");
		intArray.add("10");
		intArray.add("15");
		intArray.add("20");
		intArray.add("25");
		
		intArray.remove("25");
		
		int iVal = 4;
		
		assertEquals(intArray.size(), iVal);
	}
	
	
	//Get
	@Test
	void GetTest() {
		MyArrayList<String> intArray = new MyArrayList<String>();	
		intArray.add("5");
		intArray.add("10");
		intArray.add("15");
		intArray.add("20");
		intArray.add("25");
		
		String sVal = "15";
		
		
		assertEquals(intArray.get().get(2), sVal);
	}
	
	//Edit 
	@Test
	void EditTest() {
		MyArrayList<String> intArray = new MyArrayList<String>();
		intArray.add("1");
		intArray.add("3");
		intArray.add("5");
		intArray.add("7");
		intArray.remove("1");
		intArray.add("9");
		
		String sVal = "9";
		
		assertEquals(intArray.get().get(3), sVal);
	}
	
	@Test
	void SizeTest() {
		MyArrayList<String> intArray = new MyArrayList<String>();
		intArray.add("1");
		intArray.add("3");
		intArray.add("5");
		intArray.add("7");
		
		int iVal = 4;
		
		assertEquals(intArray.size(), iVal);
		
	}
	
	@Test
	void AccessBadIndexTest() { //Fails
		assertThrows(java.lang.IndexOutOfBoundsException.class, 
			() -> {
				MyArrayList<String> intArray = new MyArrayList<String>();
				intArray.add("2");
				intArray.add("1");
				intArray.add("0");
				intArray.add("-1");
				intArray.add("-2");
				
				System.out.println(intArray.get().get(5));
			});
			
	}
}

	
	
