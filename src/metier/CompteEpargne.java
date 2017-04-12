package metier;

public class CompteEpargne extends Compte {

	private int tauxRemuneration=3;

	public int getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(int tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	public CompteEpargne(int tauxRemuneration) {
		super();
		this.tauxRemuneration = tauxRemuneration;
	}
	
	
}
