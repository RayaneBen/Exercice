package modele;

public class Adresse {

	private String voie;
	private String Codepostal;
	private String ville;

	public Adresse() {
		super();

	}
	
	public Adresse(String voie, String codepostal, String ville) {
		super();
		this.voie = voie;
		Codepostal = codepostal;
		this.ville = ville;
	}

	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public String getCodepostal() {
		return Codepostal;
	}

	public void setCodepostal(String codepostal) {
		Codepostal = codepostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return "Adresse [voie=" + voie + ", Codepostal=" + Codepostal + ", ville=" + ville + "]";
	}

}
