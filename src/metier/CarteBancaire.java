package metier;

public abstract class CarteBancaire {

	private Client client;
	private int carteBancaire;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public CarteBancaire(Client client) {
		super();
		this.client = client;
	}

	public int getCarteBancaire() {
		return carteBancaire;
	}

	public void setCarteBancaire(int carteBancaire) {
		this.carteBancaire = carteBancaire;
	}

	public CarteBancaire(Client client, int carteBancaire) {
		super();
		this.client = client;
		this.carteBancaire = carteBancaire;
	}

	public CarteBancaire() {
		super();
	}
	
	
}
