package orm.teste;

import java.util.Scanner;

import orm.actions.RemoverAlunoPorId;

public class TestaRemoverAlunoPorId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o Id do aluno a ser removido: ");
        Long id = sc.nextLong();
        sc.nextLine();

        RemoverAlunoPorId removedor = new RemoverAlunoPorId();
        removedor.removerAluno(id);
        
        sc.close();
        removedor.close();
    }
}

