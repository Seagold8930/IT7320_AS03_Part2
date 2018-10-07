import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import loginClasses.Validation;

public class ValidationTest {
	/*
	 * Rules:
	 * 1 - Both usernames and passwords must be at least 8 characters long.
	 * 2 - Usernames must have a maximum of 200 characters
	 * 3 - Passwords must have a maximum of 128 characters
	 * 4 - Valid username characters: upper or lower case alphanumeric (a-z, A-Z, 0-9), symbols (@, _, !, (, ), ?, [, ], `, ~, #, $, ^, &, *, +, =) as well as ( - and . ) but cannot be in the first character
	 * 5 - Valid password characters: same as above with the exclusion of Commercial ats (@) 
	 */
	
	String[] validUsernames = { "IT7320_Dev&Testing-of.Softw@re!", "0123456789", "DevAndTestingOfSoftware",  "_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789" };
	
	//Index 1st: Too short, 2nd/3rd: Begins with period or dash,           4th to 9th - Possesses characters not listed	                                               10th - 201 characters long
	String[] invalidUsernames = { "DanMota", ".Dan.Mota88", "-Dan.Mota88", "\\Dan.Mota88", "/Dan.Mota88", " Dan Mota 88", " Dan.Mota88", "Dan%Mota%88", "Dan;Mota;88", "_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_" };
	
	String[] validPasswords = { "IT7320_Dev&Testing-of.Software!", "0123456789", "DevAndTestingOfSoftware", "_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_1234567" };
	
	//Index 1st: Too short, 2nd/3rd: Begins with period or dash,  4th to 9th - Possesses characters not listed									10th - 129 characters long
	String[] invalidPasswords = { "1234", ".1234567", "-1234567", "P@ssword", "Pass\\word", "Pass/word", "Pass word", "Pass%word", "Pass;Word", "_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_123456789_12345678" };
	
	Validation obj;
	
	@Before
	public void setUp() throws Exception {
		obj = new Validation();
	}
	
	@After
	public void tearDown() throws Exception {
		obj = null;
	}
	
	@Test
	public void testValidInputs() {
		for( int i = 0; i < validUsernames.length; i++ ) {
			assertTrue( obj.validateInput( validUsernames[ i ], validPasswords[ i ] ) );
		}
	}
	
	@Test
	public void testInvalidUsernames() {
		for( int i = 0; i < invalidUsernames.length; i++ ) {
			assertFalse( obj.validateInput( invalidUsernames[ i ], validPasswords[ 0 ] ) );
		}
	}
	
	@Test
	public void testInvalidPasswords() {
		for( int i = 0; i < invalidPasswords.length; i++ ) {
			assertFalse( obj.validateInput( validUsernames[ 1 ], invalidPasswords[ i ] ) );
		}
	}
}
