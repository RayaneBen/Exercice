package DAO;



import java.util.List;

import com.db4o.ObjectContainer;
import com.db4o.ObjectServer;
import com.db4o.cs.Db4oClientServer;

import modele.Rectorat;

public class DAO {

	private ObjectServer serveur = Db4oClientServer.openServer("rectoratDB", 4448);
	private ObjectContainer connexion = Db4oClientServer.openClient(Db4oClientServer.newClientConfiguration(), "172.17.0.10", 4448, "db4o", "db4o");
	
	
	public void enregistrer(Rectorat rectorat) {
		connexion.store(rectorat);
		connexion.commit();
	}
	
	public Rectorat restaurer() {
		List<Rectorat> resultat = connexion.queryByExample(new Rectorat());
		return resultat.get(0);
	}
	
}
