import static org.junit.Assert.assertEquals;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.*;

import loginClasses.AttemptLogin;

public class ServletSuccessTest {
	String successPath = "success.jsp";
	AttemptLogin servlet;
	HttpServletRequest request;
	HttpServletResponse response;
	
	@Before
	public void setUp() {
		servlet = new AttemptLogin();
		request = Mockito.mock( HttpServletRequest.class );
		response = Mockito.mock( HttpServletResponse.class );
		
		Mockito.when( request.getParameter( "user" ) ).thenReturn( "Dan_Mota88" );
		Mockito.when( request.getParameter( "pass" ) ).thenReturn( "IT7320_Dev&Testing" );
	}
	
	@After
	public void tearDown() {
		servlet = null;
		request = null;
		response = null;
	}
	
	@Test
	public void testServletSuccess() throws ServletException, IOException {
		ArgumentCaptor<String> captor = ArgumentCaptor.forClass( String.class );
		servlet.doPost( request, response );
	    Mockito.verify( response ).sendRedirect( captor.capture() );
	    assertEquals( successPath, captor.getValue() );
	}
}
