package orm.utilsDB;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//Classe responsável pelo DDL -> Data Definition Language
public class GeraTabelaAluno {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		factory.close();
	}

}
