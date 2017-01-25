package modele;

import java.util.ArrayList;
import java.util.List;

public class Rectorat {

	private String nom;
	private Adresse adresse;
	private List<Etablissement> etablissements = new ArrayList<>();

	public Rectorat() {
		super();
	}

	public Rectorat(String nom, Adresse adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public double pourcentageGenre(String sexe) {
		int nbGenre = 0;
		int nbEtudiant = 0;
		
		for(Etablissement etab: etablissements) {
			for(Etudiant etud: etab.getEtudiants()) {
				if(etud.getSexe().equals(sexe))
					nbGenre++;
			}
			nbEtudiant += etab.getEtudiants().size();
		}
		
		return nbGenre * 100 / nbEtudiant;
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

	public List<Etablissement> getEtablissements() {
		return etablissements;
	}

	public void setEtablissements(List<Etablissement> etablissements) {
		this.etablissements = etablissements;
	}

	@Override
	public String toString() {
		return "Rectorat [nom=" + nom + ", adresse=" + adresse + "]";
	}

}
