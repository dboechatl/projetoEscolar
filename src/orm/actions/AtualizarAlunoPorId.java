package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class AtualizarAlunoPorId {
    
    private EntityManagerFactory factory;
    private EntityManager manager;

    public AtualizarAlunoPorId() {
        // Conectar ao operador do ORM/JPA;
        // Colocar no Persistence.createEntityManagerFactory o nome do persistence-unit
        factory = Persistence.createEntityManagerFactory("alunos");
        manager = factory.createEntityManager();
    }

    public void atualizarAluno(Aluno aluno) {
        // Operar com "merge"
        manager.getTransaction().begin();
        manager.merge(aluno);
        manager.getTransaction().commit();
        System.out.println("Cadastro do aluno foi atualizado!");
    }

    public void close() {
        manager.close();
        factory.close();
    }
}
