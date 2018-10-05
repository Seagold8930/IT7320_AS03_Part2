package loginClasses;

public class Validation {
	private static final int MIN_LENGTH = 8;
	private static final int MAX_ID_LENGTH = 200;
	private static final int MAX_PASS_LENGTH = 128;
	private static final String PASS_PATTERN = "^[\\w!()?\\[\\]`~#$^&*+=]{1}+[\\w!()?\\[\\]`~#$^&*+=.-]+$";
	private static final String ID_PATTERN = "^[\\w!()?\\[\\]`~#$^&*+=@]{1}+[\\w!()?\\[\\]`~#$^&*+=@.-]+$";
	
	public static boolean validateInput( String username, String password ) {
		if( username.length() >= MIN_LENGTH && username.length() <= MAX_ID_LENGTH && username.matches( ID_PATTERN ) &&
			password.length() >= MIN_LENGTH && password.length() <= MAX_PASS_LENGTH && password.matches( PASS_PATTERN ) ) {
			
			return true;
		}
		
		return false;
	}
}