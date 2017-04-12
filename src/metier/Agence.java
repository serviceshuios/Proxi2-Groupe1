package metier;

public class Agence {


	private Gerant gerant;
	private String nomAgence;
	private String dateCreation;
	
	
	public Agence() {
		super();
	}


	public Agence(Gerant gerant, String nomAgence, String dateCreation) {
		super();
		this.gerant = gerant;
		this.nomAgence = nomAgence;
		this.dateCreation = dateCreation;
	}


	public Gerant getGerant() {
		return gerant;
	}


	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}


	public String getNomAgence() {
		return nomAgence;
	}


	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}


	public String getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
}
