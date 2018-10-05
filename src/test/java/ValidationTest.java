import static org.junit.Assert.*;

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
	
	String[] validUsernames = { "IT7320_Dev&Testing-of.Softw@re!", "0123456789", "DevAndTestingOfSoftware" };
	
	//Index 1st: Too short, 2nd/3rd: Begins with period or dash,           4th to 9th - Possesses characters not listed	
	String[] invalidUsernames = { "DanMota", ".Dan.Mota88", "-Dan.Mota88", "\\Dan.Mota88", "/Dan.Mota88", " Dan Mota 88", " Dan.Mota88", "Dan%Mota%88", "Dan;Mota;88" };
	
	String[] validPasswords = { "IT7320_Dev&Testing-of.Software!", "0123456789", "DevAndTestingOfSoftware" };
	
	//Index 1st: Too short, 2nd/3rd: Begins with period or dash,  4th to 9th - Possesses characters not listed
	String[] invalidPasswords = { "1234", ".1234567", "-1234567", "P@ssword", "Pass\\word", "Pass/word", "Pass word", "Pass%word", "Pass;Word" };
	
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
	public void testInvalidUsernames() {
		for( int i = 0; i < invalidUsernames.length; i++ ) {
			assertFalse( obj.validateInput( invalidUsernames[ i ], validPasswords[ 0 ] ) );
		}
	}

}
