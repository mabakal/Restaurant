package servelet;



import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baseDeDonnees.BasseDeDonnees;


@WebServlet("/Commander")
public class Commander extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Commander() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String localisation  = (String)request.getAttribute("localisation"),
				designation  = (String)request.getAttribute("designation");
		float prix		 = Float.parseFloat((String)request.getAttribute("prix"));
		
		
		Calendar calendar	 = Calendar.getInstance();
		Date		date	 = calendar.getTime(); 
		
		boolean ajout		 = BasseDeDonnees.ajouter("Commander", designation, prix, localisation, (java.sql.Date) date);
		
		request.setAttribute("commande", ajout);
		request.getServletContext().getRequestDispatcher("/Jsp/attente.jsp").forward(request, response);
	}

}
