	package Test;

import modele.Rectorat;
import DAO.DAO;

public class TestRestauration {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		Rectorat rectorat = dao.restaurer();
		System.out.println(rectorat.pourcentageGenre("F"));
		System.out.println(rectorat.pourcentageGenre("M"));

	}

}
