package servelet;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import baseDeDonnees.BasseDeDonnees;


@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletTest() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		 ResultSet result = BasseDeDonnees.afficher("Produit");
		 
			try {
				while(result.next()) {
					System.out.println(result.getString("name_produit"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

}
