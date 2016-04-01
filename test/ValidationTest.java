/**
 * 
 */


import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.gc.validate.Validation;

/**
 * @author Maurice
 *
 */
public class ValidationTest {

	private Validation validator;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		validator = new Validation();		
	}

	/*
	 * Test instantiation method
	 */
	@Test
	public void mustInstantiateTest(){
		assertNotNull(validator);
	}
	/*
	 * Test validateInt method
	 */
	@Test
	public void validateInt() {	
		String testInput = "a 1.4 1";//simulate user input of a character first, float and then the correct int datatype
		assertEquals(1, Validation.validateInt(new Scanner(testInput)));
	}		
	
}
