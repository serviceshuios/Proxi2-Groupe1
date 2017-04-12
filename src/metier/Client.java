package metier;

import java.util.ArrayList;
import java.util.List;

public class Client extends Personne {

	private ConseillerClient conseillerClient;
	private List<Compte> compte = new ArrayList<Compte>();
	private List<CarteBancaire> carteBancaire = new ArrayList<CarteBancaire>();
	
	private int idclient;
	private int idconseiller;
	private int idcompte;
	/**
	 * constructeur vide
	 */
	public Client() {
		super();
	}
	/**
	 * constructeur avec arguments
	 * @param nom nom client
	 * @param prenom prenom client
	 * @param adresse adresse client
	 * @param codePostal code postal client
	 * @param ville ville client
	 * @param telephone telephone client
	 */
	public Client(String nom, String prenom, String adresse, String codePostal, String ville, String telephone) {
		super(nom, prenom, adresse, codePostal, ville, telephone);
	}
	public ConseillerClient getConseillerClient() {
		return conseillerClient;
	}
	public void setConseillerClient(ConseillerClient conseillerClient) {
		this.conseillerClient = conseillerClient;
	}
	public List<Compte> getCompte() {
		return compte;
	}
	public void setCompte(List<Compte> compte) {
		this.compte = compte;
	}
	public List<CarteBancaire> getCarteBancaire() {
		return carteBancaire;
	}
	public void setCarteBancaire(List<CarteBancaire> carteBancaire) {
		this.carteBancaire = carteBancaire;
	}
	public int getIdconseiller() {
		return idconseiller;
	}
	public void setIdconseiller(int idconseiller) {
		this.idconseiller = idconseiller;
	}
	public int getIdcompte() {
		return idcompte;
	}
	public void setIdcompte(int idcompte) {
		this.idcompte = idcompte;
	}
	public int getIdclient() {
		return idclient;
	}
	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}
		
}
