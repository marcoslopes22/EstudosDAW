//ETE - PORTO DIGITAL
//DISCIPLINA: DESENVOLVIMENTO DE APLICAÇÃO DESKTOP
//PROFESSOR: PEDRO
//ALUNO: MARCOS AURELIO LOPES DE ARAUJO
//DATA: XIII III XXII

//DESCRIÇÃO: ELABORE UM ALGORITMO QUE LEIA O PESO E A ALTURA DE UM ADULTO E MOSTRE
//SUA CONDIÇÃO DE ACORDO COM A TABELA DE CONDIÇÕES(ABAIXO DO PESO, PESO NORMAL, ACIMA DO PESO E OBESIDADE).

package questao03;
import java.util.Scanner;

public class MainQuestao03 {
    public static void main (String[] args){

//DECLARANDO AS VARIÁVEIS NECESSÁRIAS        
        try (Scanner fazerLeitura = new Scanner(System.in)) {
            String nome;
            Double peso;
            Double altura;

//ENTRADA DE DADOS
            System.out.println("Digite seu nome: ");
            nome = fazerLeitura.nextLine();

            System.out.println("\nDigite seu peso: ");
            peso = fazerLeitura.nextDouble();

            System.out.println("\nDigite sua altura");
            altura = fazerLeitura.nextDouble();

//IMPRIMIR TABELA DE ORIENTAÇÃO
            String [] tabelaInformar = {"\nTabela de Condoções do IMC(adultos):",
            "\nAbaixo de 18,5: Abaixo do peso.",
            "Entre 18,5 e 25: Peso normal",
            "Entre 25 e 30: Acima do peso.",
            "Acima de 30: Obesidade."};

            for(int x = 0; x < tabelaInformar.length; x++){
                System.out.println(tabelaInformar[x]);
            }

//MOSTRNADO OS ATRIBUTOS E A CONDIÇÃO DO USUÁRIO
            System.out.println("\nNome: " + nome + "\nPeso: " + peso + " Kg");
            System.out.printf("Altura: " + "%.2f", altura);
            System.out.println(" Cm");

            Double imcUsuario = peso/(altura * altura);
            System.out.printf("IMC: " + "%.2f", imcUsuario);
            System.out.println(" Imc");

            String [] listClassificar = {"Abaixo do peso.", "Peso normal.", "Acima do peso.", "Obesidade"};

            if (imcUsuario < 18.5){
                System.out.println("\nA condição de " + nome + " é: " + listClassificar[0] + "\n");
            }
            else if (imcUsuario >= 18.5 && imcUsuario <= 25){
                System.out.println("\nA condição de " + nome + " é: " + listClassificar[1] + "\n");
            }
            else if (imcUsuario >= 25 && imcUsuario <= 30){
                System.out.println("\nA condição de " + nome + " é: " + listClassificar[2] + "\n");
            }
            else if (imcUsuario > 30){
                System.out.println("\nA condição de " + nome + " é: " + listClassificar[3] + "\n");
            }
        }
    }
}
