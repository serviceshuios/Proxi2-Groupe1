package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Client;
import service.ConseillerClientService;
import service.IConseillerClientService;

/**
 * Servlet implementation class MaServlet
 */
@WebServlet("/AjouterClient")
public class AjouterClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IConseillerClientService ics = new ConseillerClientService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		// 1- récupérer les paramètres
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String codepostal = request.getParameter("codePostal");
		String ville = request.getParameter("ville");
		String telephone = request.getParameter("telephone");

		
		// 2- traitements avec la couche service
		
		
		Client c = new Client();
		
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setAdresse(adresse);
		c.setCodePostal(codepostal);
		c.setVille(ville);
		c.setTelephone(telephone);
		
		
		ics.creerClient(c);
		
		// 3- préparation envoi
		request.setAttribute("client", c);
		
		
		// 4- envoi
		request.getRequestDispatcher("/ajouterclient.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
