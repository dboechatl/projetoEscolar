package orm.teste;

import java.util.List;

import orm.actions.ListarAlunos;
import orm.model.Aluno;

public class TestaListarAlunos {
    public static void main(String[] args) {
        ListarAlunos listador = new ListarAlunos();
        List<Aluno> listaAlunos = listador.listarTodos();

        System.out.println("");
        System.out.println("Lista dos alunos");
        for (Aluno aluno : listaAlunos) {
            System.out.println("");
            System.out.println("ID: " + aluno.getId());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Email: " + aluno.getEmail());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("Data de Nascimento: " + aluno.getDataNascimento());
            System.out.println("Naturalidade: " + aluno.getNaturalidade());
            System.out.println("Endereço: " + aluno.getEndereco());
            System.out.println("");
        }

        listador.close();
    }
}

