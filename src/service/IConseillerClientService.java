package service;

import java.util.Collection;

import metier.CarteBancaire;
import metier.Client;
import metier.Compte;
import metier.Personne;

public interface IConseillerClientService {

	public void authentification(String login , int password);
	public void creerClient(Client cl);
	public void modifierClient(int idclient);
	public void supprimerClient(int idclient);
	public void infoClient(int idclient);
	public void listerClient(Collection <Client> cl);
	public void simulerCreditConsommation(int montant);
	public void simulerCreditImmobilier(int montant);
	public void virement(Compte crediteur, Compte debiteur, float somme);
	public void activerCarte(CarteBancaire numCarte);
	public void desactiverCarte(CarteBancaire numCarte);	
}
