package exercicio02;
import java.util.Scanner;

public class Questaotres {
    public static void main(String [] args){
        while(true){
            Scanner ler = new Scanner(System.in);

            int codigoPedido;
            String nomeProduto = "";
            double valorProduto=0;
            double valorTotal=0;
            int quantidade=0;

            String[] menu = {"LANCHE     CÓDIGO     PREÇO"};
            String[] lanches = {"Cachorro quente","Cauru Simples","Bauru Com Ovo","Hambúrguer","Cheeseburguer","Refrigerante"};
            int[] codigo = {101,102,103,104,105,106};
            double[] valor = {1.20,1.30,1.50,1.20,1.30,1.00};
            
            System.out.println(menu[0]);
            for(int i=0;i<lanches.length;i++){
            System.out.print(lanches[i]+"     ");
            System.out.print(codigo[i]+"     ");
            System.out.println(valor[i]+"     ");
            };

            System.out.println("Digite o código do produto: ");
            codigoPedido = ler.nextInt();

            switch (codigoPedido) {
                case 101:
                    nomeProduto = lanches[0];
                    valorProduto = valor[0];
                    System.out.println("Produto escolhido: "+nomeProduto);

                    System.out.println("Digite a quantidade: ");
                    quantidade = ler.nextInt();

                    valorTotal = valorProduto*quantidade;

                    System.out.println("Produto: "+nomeProduto+ "| Valor: "+valorProduto+ " reais | Quantidade: "+quantidade+ "| Valor total:"+valorTotal+ " reais");
                    break;
                case 102:
                    nomeProduto = lanches[1];
                    valorProduto = valor[1];
                    System.out.println("Produto escolhido: "+nomeProduto);

                    System.out.println("Digite a quantidade: ");
                    quantidade = ler.nextInt();

                    valorTotal = valorProduto*quantidade;

                    System.out.println("Produto: "+nomeProduto+ "| Valor: "+valorProduto+ " reais | Quantidade: "+quantidade+ "| Valor total:"+valorTotal+ " reais");
                    break;
                case 103:
                    nomeProduto = lanches[2];
                    valorProduto = valor[2];
                    System.out.println("Produto escolhido: "+nomeProduto);

                    System.out.println("Digite a quantidade: ");
                    quantidade = ler.nextInt();

                    valorTotal = valorProduto*quantidade;

                    System.out.println("Produto: "+nomeProduto+ "| Valor: "+valorProduto+ " reais | Quantidade: "+quantidade+ "| Valor total:"+valorTotal+ " reais");
                    break;
                case 104:
                    nomeProduto = lanches[3];
                    valorProduto = valor[3];
                    System.out.println("Produto escolhido: "+nomeProduto);

                    System.out.println("Digite a quantidade: ");
                    quantidade = ler.nextInt();

                    valorTotal = valorProduto*quantidade;

                    System.out.println("Produto: "+nomeProduto+ "| Valor: "+valorProduto+ " reais | Quantidade: "+quantidade+ "| Valor total:"+valorTotal+ " reais");
                    break;
                case 105:
                    nomeProduto = lanches[4];
                    valorProduto = valor[4];
                    System.out.println("Produto escolhido: "+nomeProduto);

                    System.out.println("Digite a quantidade: ");
                    quantidade = ler.nextInt();

                    valorTotal = valorProduto*quantidade;

                    System.out.println("Produto: "+nomeProduto+ "| Valor: "+valorProduto+ " reais | Quantidade: "+quantidade+ "| Valor total:"+valorTotal+ " reais");
                    break;
                case 106:
                    nomeProduto = lanches[5];
                    valorProduto = valor[5];
                    System.out.println("Produto escolhido: "+nomeProduto);

                    System.out.println("Digite a quantidade: ");
                    quantidade = ler.nextInt();

                    valorTotal = valorProduto*quantidade;

                    System.out.println("Produto: "+nomeProduto+ "| Valor: "+valorProduto+ " reais | Quantidade: "+quantidade+ "| Valor total:"+valorTotal+ " reais");
                    break;
                default:
                System.out.println("Produto não encontrado.");
                break;
            }
        }
    }
}
