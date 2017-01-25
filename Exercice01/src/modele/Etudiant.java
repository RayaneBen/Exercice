package modele;

public class Etudiant {

	private String nom;
	private String prenom;
	private String sexe;

	public Etudiant() {
		super();
	}

	public Etudiant(String nom, String prenom, String sexe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + "]";
	}

}
