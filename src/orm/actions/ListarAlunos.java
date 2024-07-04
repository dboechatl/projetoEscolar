package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.model.Aluno;

public class ListarAlunos {
    
    private EntityManagerFactory factory;
    private EntityManager manager;

    public ListarAlunos() {
        // Conectar ao operador do ORM/JPA;
        // Colocar no Persistence.createEntityManagerFactory o nome do persistence-unit
        factory = Persistence.createEntityManagerFactory("alunos");
        manager = factory.createEntityManager();
    }

    public List<Aluno> listarTodos() {
        String sql = "select a from Aluno a";
        
        // JPQL: classe Query de "javax.persistence"
        Query query = manager.createQuery(sql);
        
        // Retornando o resultado
        return query.getResultList();
    }

    public void close() {
        manager.close();
        factory.close();
    }
}
