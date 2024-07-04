package orm.actions;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.model.Aluno;

public class BuscarAlunoPorInicial {
    
    private EntityManagerFactory factory;
    private EntityManager manager;

    public BuscarAlunoPorInicial() {
        // Conectar ao operador do ORM/JPA;
        // Colocar no Persistence.createEntityManagerFactory o nome do persistence-unit
        factory = Persistence.createEntityManagerFactory("alunos");
        manager = factory.createEntityManager();
    }

    public List<Aluno> buscarAlunosPorLetraInicial(String letraInicial) {
        // Criar a consulta para buscar alunos pela primeira letra do nome
        String sql = "SELECT a FROM Aluno a WHERE a.nome LIKE :letraInicial";
        Query query = manager.createQuery(sql);
        query.setParameter("letraInicial", letraInicial + "%");

        // Retornar o resultado da consulta
        return query.getResultList();
    }

    public void close() {
        manager.close();
        factory.close();
    }
}
