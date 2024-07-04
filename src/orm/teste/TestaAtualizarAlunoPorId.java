package orm.teste;

import java.util.Scanner;

import orm.actions.AtualizarAlunoPorId;
import orm.model.Aluno;

public class TestaAtualizarAlunoPorId {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o Id do aluno a ser atualizado: ");
        aluno.setId(sc.nextLong());
        sc.nextLine();
        System.out.println("Nome: ");
        aluno.setNome(sc.nextLine());
        System.out.println("Email: ");
        aluno.setEmail(sc.nextLine());
        System.out.println("CPF: ");
        aluno.setCpf(sc.nextLine());
        System.out.println("Data de Nascimento: ");
        aluno.setDataNascimento(sc.nextLine());
        System.out.println("Naturalidade: ");
        aluno.setNaturalidade(sc.nextLine());
        System.out.println("Endereço: ");
        aluno.setEndereco(sc.nextLine());

        AtualizarAlunoPorId atualizador = new AtualizarAlunoPorId();
        atualizador.atualizarAluno(aluno);
        
        sc.close();
        atualizador.close();
    }
}
