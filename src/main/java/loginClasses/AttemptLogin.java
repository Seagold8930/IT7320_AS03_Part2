package loginClasses;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AttemptLogin extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    public AttemptLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("user");
		String password = request.getParameter("pass");
		Validation obj = new Validation();
		
		if( obj.validateInput(username, password) && username.matches( "Dan_Mota88" ) && password.matches( "IT7320_Dev&Testing" ) ) {
			response.sendRedirect( "success.jsp" );
		} else {
			response.sendRedirect( "error.jsp" );
		}
	}

}
