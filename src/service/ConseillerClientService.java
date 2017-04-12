package service;

import java.util.Collection;

import dao.Dao;
import dao.IDao;
import metier.CarteBancaire;
import metier.Client;
import metier.Compte;

public class ConseillerClientService implements IConseillerClientService {
	
	private IDao idao = new Dao();

	@Override
	public void authentification(String login, int password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creerClient(Client cl) {
		// TODO Auto-generated method stub
		idao.creerClient(cl);
		
	}

	@Override
	public void modifierClient(int idclient) {
		// TODO Auto-generated method stub
		idao.modifierClient(idclient);
		
	}

	@Override
	public void supprimerClient(int idclient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void infoClient(int idclient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listerClient(Collection<Client> cl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void simulerCreditConsommation(int montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void simulerCreditImmobilier(int montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void virement(Compte crediteur, Compte debiteur, float somme) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activerCarte(CarteBancaire numCarte) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desactiverCarte(CarteBancaire numCarte) {
		// TODO Auto-generated method stub
		
	}

}
