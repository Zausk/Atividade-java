import java.util.Scanner;

class formulario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é nome do aluno?");
        String nomeAluno = scanner.next();

        System.out.println("Qual é a idade do aluno");
        int idade = scanner.nextInt();

        chamada chamada = new chamada();
        chamada.adicionarAluno(nomeAluno, idade);

        System.out.println("O Aluno " + nomeAluno + "esta presente");
        int presenca = scanner.nextInt();

        if (presenca == 1) {
            chamada.marcaPresenca();
        }
        scanner.close();
    }
}