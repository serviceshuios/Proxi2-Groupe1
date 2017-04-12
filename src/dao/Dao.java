package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import metier.CarteBancaire;
import metier.Client;

public class Dao implements IDao {

	
	@Override
	public void creerClient(Client c) {
		try {
			Connection conn = DaoConnexion.getConnexion();
			// 3- créer la requête
			PreparedStatement ps = conn
					.prepareStatement("INSERT INTO Client(nom, prenom, adresse, code postal, ville, telephone) VALUES (?, ?, ?, ?, ?, ?)");
			ps.setString(1, c.getNom());
			ps.setString(2, c.getPrenom());
			ps.setString(3, c.getAdresse());
			ps.setString(4, c.getCodePostal());
			ps.setString(5, c.getVille());
			ps.setString(4, c.getTelephone());
		
			// 4- executer la requête
			ps.executeUpdate();
			// 5- présenter les résultats

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelque soit les étapes précédentes
			// 6- fermer la connexion
			DaoConnexion.closeConnexion();
		}

	}

	@Override
	public Collection<Client> listerClients() {

		Collection<Client> clients = new ArrayList<Client>();
		try {
			Connection conn = DaoConnexion.getConnexion();
			// 3- créer la requête
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Client");
			// 4- executer la requête
			ResultSet rs = ps.executeQuery();
			// 5- présenter les résultats
			while (rs.next()) {
				Client c = new Client();
				c.setIdclient(rs.getInt("idclient"));
				c.setNom(rs.getString("nom"));
				c.setPrenom(rs.getString("prenom"));
				c.setAdresse(rs.getString("adresse"));
				c.setCodePostal(rs.getString("codepostal"));
				c.setVille(rs.getString("ville"));
				c.setTelephone(rs.getString("telephone"));

				clients.add(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelque soit les étapes précédentes
			// 6- fermer la connexion
			DaoConnexion.closeConnexion();
		}
		return clients;
	}

	@Override
	public void modifierClient(int idclient) {

		try {
			Connection conn = DaoConnexion.getConnexion();
			// 3- créer la requête
			PreparedStatement ps = conn.prepareStatement("UPDATE client SET nom = ? , prenom = ?, adresse = ?, codepostal = ?,"
					+ "ville = ?, telephone = ? WHERE idclient = ?");
			ps.setString(1, "nom");
			ps.setString(2, "prenom");
			ps.setInt(7, idclient);
			ps.setString(3, "adresse");
			ps.setString(4, "codepostal");
			ps.setString(5, "ville");
			ps.setString(6, "telephone");

			// 4- executer la requête
			ps.executeUpdate();
			// 5- présenter les résultats
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelque soit les étapes précédentes
			// 6- fermer la connexion
			DaoConnexion.closeConnexion();
		}
	}

	@Override
	public Client infoClient(int idclient) {

		Client c = new Client();

		try {
			Connection conn = DaoConnexion.getConnexion();
			// 3- créer la requête
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Client WHERE idclient = ?");
			ps.setInt(1, idclient);
			// 4- executer la requête
			ResultSet rs = ps.executeQuery();
			// 5- présenter les résultats

			if (rs.next()) {

				c.setIdclient(rs.getInt("id"));
				c.setNom(rs.getString("nom"));
				c.setPrenom(rs.getString("prenom"));
				c.setAdresse(rs.getString("adresse"));
				c.setCodePostal(rs.getString("codepostal"));
				c.setVille(rs.getString("ville"));
				c.setTelephone(rs.getString("telephone"));
				conn.close();

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelque soit les étapes précédentes
			// 6- fermer la connexion
			DaoConnexion.closeConnexion();
		}

		return c;
	}

	@Override
	public void supprimerClient(int idclient) {
		try {
			Connection conn = DaoConnexion.getConnexion();
			// 3- créer la requête
			PreparedStatement ps = conn.prepareStatement("DELETE FROM Client WHERE idclient = " + idclient);
			// 4- executer la requête
			ps.executeUpdate();

			// 5- présenter les résultats
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// code qui est executé quelque soit les étapes précédentes
			// 6- fermer la connexion
			DaoConnexion.closeConnexion();
		}

	}

	@Override
	public void authentification(String login, String password) {
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
	public void virement(int idcompte1, int idcompte2, float somme) {
		// TODO Auto-generated method stub
		//a faire
		//
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
