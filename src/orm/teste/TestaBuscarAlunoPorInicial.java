package orm.teste;

import java.util.List;
import java.util.Scanner;

import orm.actions.BuscarAlunoPorInicial;
import orm.model.Aluno;

public class TestaBuscarAlunoPorInicial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira letra do nome dos alunos a serem buscados: ");
        String letraInicial = sc.nextLine();

        BuscarAlunoPorInicial buscador = new BuscarAlunoPorInicial();
        List<Aluno> alunosEncontrados = buscador.buscarAlunosPorLetraInicial(letraInicial);
        
        System.out.println("");
        System.out.println("Alunos encontrados:");
        for (Aluno aluno : alunosEncontrados) {
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

        buscador.close();
        sc.close();
    }
}
