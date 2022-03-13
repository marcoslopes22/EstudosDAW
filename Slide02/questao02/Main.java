package questão02;

//ETE PORTO DIGITAL - RECIFE
//DISCIPLINA: DESENVOLVIMENTO DE APLICAÇÃO DESKTOP
//PROFESSOR: PEDRO
//ALUNO: MARCOS AURELIO LOPES DE ARAUJO
//XIII III XXII

//OBJETIVO: CRIAR UM PROGRAMA CAPAZ DE LER DUAS VARIÁVEIS E APLICAR AS SEGUINTES CONDIÇÕES:
//          SE OS VALORES FOREM IGUAIS, DEVERÃO SE SOMAR, CASO CONTRÁRIO, MULTIPLICAR.
//          AO FINAL DE QUALQUER UM DOS CÁLCULOS, O RESULTADO DEVE SER ATRIBUIDO A UMA
//          TERCEIRA VARIÁVEL QUE TERÁ SEU VALOR IMPRIMIDO NA TELA.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        while(true){
            
            Scanner ler = new Scanner(System.in);
            int a;
            int b;
            int c;

            System.out.println("Digite um valor para a variável A: ");
            a = ler.nextInt();

            System.out.println("Digite um valor para a variável B: ");
            b = ler.nextInt();

            if (a == b){
                c = a + b;
                System.out.println("os valores são iguais, portanto, a + b: " + c);
            }
            else if (a != b ){
                c = a * b;
                System.out.println("os valores sao diferentes, portanto, a * b: " + c);
            }
        }
    }    
}
