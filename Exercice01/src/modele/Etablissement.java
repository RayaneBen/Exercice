package modele;

import java.util.ArrayList;
import java.util.List;

public class Etablissement {

	private String nom;
	private Adresse adresse;
	private String type;
	private List<Etudiant> etudiants = new ArrayList<>();

	public Etablissement() {
		super();
	}

	public Etablissement(String nom, Adresse adresse, String type) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	@Override
	public String toString() {
		return "Etablissement [nom=" + nom + ", adresse=" + adresse + ", type=" + type + "]";
	}

}
