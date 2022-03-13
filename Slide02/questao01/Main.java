package atividade1;

//ETE PORTO DIGITAL
//DISCIPLINA: DESENVOLVIMENTO DE APLICAÇÃO DESKTOP
//PROFESSOR: PEDRO
//ALUNO: MARCOS AURELIO LOPES DE ARAUJO
//XII III XXII

//CLASSE PRINCIPAL

public class Main {
    public static void main(String[] args){

//INSTANCIANDO O BANCO DOS PRODUTOS.
        Bancodeprodutos produtos;
        produtos = new Bancodeprodutos();

        System.out.println("\nLista de produtos disponíveis: ");

//CHAMANDO O MÉTODO PRESENTE NO BANCO DE PRODUTOS.
        produtos.bancoProdutos();
        
    }
}
