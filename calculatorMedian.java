import java.util.Scanner; // Importa a classe Scanner para permitir a entrada de dados pelo usuário

public class CalculoMediaAlunos { // Declaração da classe principal

    public static void main(String[] args) { // Método principal que é executado quando o programa é iniciado

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entradas do teclado

        System.out.println("Calculadora de Média de Alunos"); // Exibe uma mensagem para o usuário

        System.out.print("Quantos alunos deseja calcular a média? "); // Solicita o número de alunos

        int numAlunos = scanner.nextInt(); // Lê o número de alunos fornecido pelo usuário

        double somaNotas = 0.0; // Inicializa uma variável para armazenar a soma das notas

        for (int i = 1; i <= numAlunos; i++) { // Loop que percorre cada aluno

            System.out.print("Digite a nota do aluno " + i + ": "); // Solicita a nota do aluno atual
            double nota = scanner.nextDouble(); // Lê a nota do aluno

            somaNotas += nota; // Adiciona a nota à soma das notas
        }

        double media = somaNotas / numAlunos; // Calcula a média das notas

        System.out.println("A média das notas dos " + numAlunos + " alunos é: " + media); // Exibe a média

        scanner.close(); // Fecha o Scanner para evitar vazamentos de recursos
    }
}

/* Aqui está uma explicação de cada linha do código:

import java.util.Scanner;: Importa a classe Scanner para permitir a entrada de dados pelo usuário.

public class CalculoMediaAlunos {: Declaração da classe principal chamada CalculoMediaAlunos.

public static void main(String[] args) {: Início do método principal, que é o ponto de entrada do programa.

Scanner scanner = new Scanner(System.in);: Cria um objeto Scanner chamado scanner para ler entradas do teclado.

System.out.println("Calculadora de Média de Alunos");: Exibe uma mensagem para o usuário.

System.out.print("Quantos alunos deseja calcular a média? ");: Solicita ao usuário o número de alunos.

int numAlunos = scanner.nextInt();: Lê o número de alunos fornecido pelo usuário e armazena em numAlunos.

double somaNotas = 0.0;: Inicializa uma variável para armazenar a soma das notas dos alunos.

for (int i = 1; i <= numAlunos; i++) {: Inicia um loop que percorre cada aluno.

System.out.print("Digite a nota do aluno " + i + ": ");: Solicita ao usuário a nota do aluno atual.

double nota = scanner.nextDouble();: Lê a nota do aluno e armazena em nota.

somaNotas += nota;: Adiciona a nota à soma das notas.

}: Fecha o loop.

double media = somaNotas / numAlunos;: Calcula a média das notas.

System.out.println("A média das notas dos " + numAlunos + " alunos é: " + media);: Exibe a média calculada.

scanner.close();: Fecha o objeto Scanner para evitar vazamentos de recursos.

Espero que esta explicação ajude você a entender o funcionamento deste programa Java para calcular a média de alunos. */
