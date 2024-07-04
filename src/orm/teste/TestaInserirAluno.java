package orm.teste;

import java.util.Scanner;

import orm.actions.InserirAluno;
import orm.model.Aluno;

public class TestaInserirAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

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

        InserirAluno inseridor = new InserirAluno();
        inseridor.inserirAluno(aluno);
        
        sc.close();
        inseridor.close();
    }
}

