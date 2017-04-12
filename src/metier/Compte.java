package metier;

public abstract class Compte {
	
	private Client client;
	private int numerocompte;
	private int solde;
	private int dateOuverture;
	private int id_type_compte;
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public int getNumerocompte() {
		return numerocompte;
	}
	public void setNumerocompte(int numerocompte) {
		this.numerocompte = numerocompte;
	}
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public int getDateOuverture() {
		return dateOuverture;
	}
	public void setDateOuverture(int dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	public int getId_type_compte() {
		return id_type_compte;
	}
	public void setId_type_compte(int id_type_compte) {
		this.id_type_compte = id_type_compte;
	}	
	
}
