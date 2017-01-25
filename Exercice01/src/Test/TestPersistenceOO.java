package Test;

import modele.Adresse;
import modele.Etablissement;
import modele.Etudiant;
import modele.Rectorat;
import DAO.DAO;

public class TestPersistenceOO {

	public static void main(String[] args) {
		
		Etudiant e1 = new Etudiant("DUPONT", "Pierre", "M");
		Etudiant e2 = new Etudiant("DURAND", "Isabelle", "F");
		Etudiant e3 = new Etudiant("ABELLARD", "Christian", "M");
		Etudiant e4 = new Etudiant("LEROUX", "Françoise", "F");
		Etudiant e5 = new Etudiant("MALAPARTE", "John", "M");
		Etudiant e6 = new Etudiant("BUTTERWORTH", "Christine", "F");
		Etudiant e7 = new Etudiant("REVEL", "Jean", "M");
		Etudiant e8 = new Etudiant("PETRELLE", "Nicole", "F");
		Etudiant e9 = new Etudiant("LAZARD", "Catherine", "F");
		
		Etablissement eta1 = new Etablissement("Lycée Richelieu", new Adresse("10 rue des lilas", "92300", "Rueil-Malmaison"), "lycée");
		Etablissement eta2 = new Etablissement("Lycée Paul Lapie", new Adresse("5 boulevard A. Briand", "92400", "Courbevoie"), "collège");
		Etablissement eta3 = new Etablissement("Université Paris X Nanterre", new Adresse("10 avenue de lille", "92500", "Nanterre"), "université");
		
		eta1.getEtudiants().add(e1);
		eta1.getEtudiants().add(e2);
		eta1.getEtudiants().add(e3);
	
		eta2.getEtudiants().add(e4);
		eta2.getEtudiants().add(e5);
		
		eta3.getEtudiants().add(e6);
		eta3.getEtudiants().add(e7);
		eta3.getEtudiants().add(e8);
		eta3.getEtudiants().add(e9);
	
		Rectorat rectorat = new Rectorat("Rectorat de Versailles", new Adresse("5 avenue des Etats Unis", "78150", "Versailles"));
		
		rectorat.getEtablissements().add(eta1);
		rectorat.getEtablissements().add(eta2);
		rectorat.getEtablissements().add(eta3);
		
		
		DAO dao = new DAO();
		dao.enregistrer(rectorat);
		
		System.out.println(rectorat.pourcentageGenre("M"));
		System.out.println(rectorat.pourcentageGenre("F"));
		
	}

}
