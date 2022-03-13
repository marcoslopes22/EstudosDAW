package atividade1;

//ETE PORTO DIGITAL
//DISCIPLINA: DESENVOLVIMENTO DE APLICAÇÃO DESKTOP
//PROFESSOR: PEDRO
//ALUNO: MARCOS AURELIO LOPES DE ARAUJO
//XII III XXII

//BANCO DE DADOS ONDE FICA ARMAZENADO MANUALMENTE OS PRODUTOS NACIONAIS, IMPORTADOS E GERAIS (SEPARADOS POR LISTAS).

public class Bancodeprodutos {

    public void bancoProdutos(){

//PROPRIEDADES DOS PRODUTOS.
        String nome = "Nome do produto: ";
        double taxaImportar = 2.17;

//LISTAS DOS PRODUTOS DE ACORDO COM SUAS ORIGENS.
        String [] produtosImportados = {"Computador", "Celular", "Notebook", "", "", ""};
        String [] produtosNacionais = {"Mousepad", "Monitor", "Livro", "", "", ""};
        String [] listaGeral = {"Mousepad", "Computador", "Monitor", "Livro", "Celular", "Notebook"};
        int [] valorProdutos = {35, 1597, 675, 16, 980, 1299};

//IMPRIMIR OS PRODUTOS DA LISTA GERAL.
        for (int a = 0; a < listaGeral.length; a++){

            System.out.println(nome + listaGeral[a] + " / valor: R$ " + valorProdutos[a] + " reais.");
        }

//SEPARAÇÃO DOS PRODUTOS IMPORTADOS APLICANDO A TAXA DE IMPORTAÇÃO NOS REPECTIVOS VALORES.
        for (int x = 0; x < produtosImportados.length; x++){
            for (int y = 0; y < listaGeral.length; y++){

                if (listaGeral[y] == produtosImportados[x]){
                    System.out.println("Produtos Importados(taxa de importação): " + produtosImportados[x] + " / valor: R$ " + valorProdutos[y] * taxaImportar + " reais");
                }
            }
        }

//SEPARAÇÃO DOS PRODUTOS NACIONAIS.
        for (int z = 0; z < produtosNacionais.length; z++){
            for (int j = 0; j < listaGeral.length; j++){

                if (listaGeral[j] == produtosNacionais[z]){
                    System.out.println("Produtos Nacionais(isento de taxa de importação): R$ " + produtosNacionais[z] + " / valor: R$ " + valorProdutos[z] + " reais.");
                }
            }
        }
    }
}
