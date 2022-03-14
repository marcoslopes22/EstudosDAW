//ETE PORTO DIGITAL
//DISCIPLINA: DESENVOLVIMENTO DE APLICAÇÃO DESKTOP
//PROFESSOR: PEDRO
//ALUNO: MARCOS AURELIO LOPES DE ARAUJO
//XIV III XXII

//DESCRIÇÃO: CRIE UM ALGORITMO EM JAVA QUE RECEBA A IDADE DE UMA PESSOA E INFORME A SUA CLASSE ELEITORAL.

package questao04;
import java.util.Scanner;

public class MainQuestao04 {
    public static void main(String [] args){
//ALICANDO UM FUNCIONAMENTO CONSTANTE.
        System.out.println("Consultar classe eleitoral.");
        while(true){
            Scanner leitor = new Scanner(System.in);
            Dados classe = new Dados();
            String nome;
            int idade;

//ENTRADA DE DADOS.
            System.out.println("Informe seu nome: ");
            nome = leitor.nextLine();

            System.out.println("\nDigite sua idade: ");
            idade = leitor.nextInt();

            System.out.println("\nNome: " + nome);
            System.out.println("Idade: " + idade + " anos");

//APLICANDO A CONDIÇÃO E MOSTRANDO A CLASSE ELEITORAL DO USUÁRIO.
            if (idade < 16 || idade >= 65){
                 System.out.println("Classe eleitoral: " + classe.naoEleitor + "\n");
            }
            else if (idade >= 16 && idade <= 17){
                System.out.println("Classe eleitoral: " + classe.eleitorfacultativo + "\n");
            }
            else if (idade >= 18 && idade < 65){
                System.out.println("Classe eleitoral: " + classe.eleitorObrigatorio + "\n");
            }
        }
    }
}
