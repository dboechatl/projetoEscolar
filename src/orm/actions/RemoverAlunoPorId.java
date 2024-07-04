package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.model.Aluno;

public class RemoverAlunoPorId {
    
    private EntityManagerFactory factory;
    private EntityManager manager;

    public RemoverAlunoPorId() {
        // Conectar ao operador do ORM/JPA;
        // Colocar no Persistence.createEntityManagerFactory o nome do persistence-unit
        factory = Persistence.createEntityManagerFactory("alunos");
        manager = factory.createEntityManager();
    }

    public void removerAluno(Long id) {
        // Buscar o objeto a ser excluído
        Aluno aluno = manager.find(Aluno.class, id);
        if (aluno != null) {
            // Operar com "remove"
            manager.getTransaction().begin();
            manager.remove(aluno);
            manager.getTransaction().commit();
            System.out.println("Aluno excluído!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

    public void close() {
        manager.close();
        factory.close();
    }
}
