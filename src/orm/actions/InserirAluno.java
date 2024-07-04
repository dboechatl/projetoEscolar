package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class InserirAluno {
    
    private EntityManagerFactory factory;
    private EntityManager manager;

    public InserirAluno() {
        // Conectar ao operador do ORM/JPA;
        // Colocar no Persistence.createEntityManagerFactory o nome do persistence-unit
        factory = Persistence.createEntityManagerFactory("alunos");
        manager = factory.createEntityManager();
    }

    public void inserirAluno(Aluno aluno) {
        // Operar com "persist"
        manager.getTransaction().begin();
        manager.persist(aluno);
        manager.getTransaction().commit();
        System.out.println("Tarefa inserida, ID: " + aluno.getId());
    }

    public void close() {
        manager.close();
        factory.close();
    }
}
