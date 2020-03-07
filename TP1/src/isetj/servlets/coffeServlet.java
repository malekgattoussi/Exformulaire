package isetj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class coffeServlet
 */
@WebServlet("/coffeServlet")
public class coffeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public coffeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String qualite = request.getParameter("qualite");
		String texteremarque = request.getParameter("texteremarque");
		PrintWriter out = response.getWriter();
		out.println("<html><head>");
		out.println("<title>Starbucks Coffee</title></head>");
		out.println("<body><img src='image.jpg' width='100px' heigth='100px'>");
		out.println("<p>merci de nous avoir fait parvenir la remarque suivante concernant </p>");
		out.println("<b>"+qualite+"</b>");
		out.println("<p>"+texteremarque);
		out.println("</body></html>");
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
