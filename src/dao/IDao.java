package dao;

import java.util.Collection;

import metier.CarteBancaire;
import metier.Client;
import metier.Compte;

public interface IDao {

	public void authentification(String login , String password);
	public void creerClient(Client cl);
	public void modifierClient(int idclient);
	public void supprimerClient(int idclient);
	public Client infoClient(int idclient);
	public Collection<Client> listerClients();
	public void simulerCreditConsommation(int montant);
	public void simulerCreditImmobilier(int montant);
	public void virement(int idcompte1, int idcompte2, float somme);
	public void activerCarte(CarteBancaire numCarte);
	public void desactiverCarte(CarteBancaire numCarte);
	
}
