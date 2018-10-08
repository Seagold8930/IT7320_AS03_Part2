package loginClasses;

public class Validation {
	private static final int MIN_LENGTH = 8;
	private static final int USER_MAX = 200;
	private static final int PASS_MAX = 128;
	private static final String USER_PATTERN = "^[\\w!()?\\[\\]`~#$^&*+=@]{1}+[\\w!()?\\[\\]`~#$^&*+=@.-]+$";
	private static final String PASS_PATTERN = "^[\\w!()?\\[\\]`~#$^&*+=]{1}+[\\w!()?\\[\\]`~#$^&*+=.-]+$";
	
	public boolean validateInput(String username, String password) {
		if( username.length() >= MIN_LENGTH && username.length() <= USER_MAX && password.length() >= MIN_LENGTH &&
			password.length() <= PASS_MAX  && username.matches( USER_PATTERN ) && password.matches( PASS_PATTERN ) ) {
			
			return true;
		}

		return false;
	}

}
