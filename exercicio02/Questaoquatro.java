package exercicio02;
import java.util.Scanner;

public class Questaoquatro {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double valorUnidade=0;
        double quantidade=0;
        double total=0;
        
        System.out.println("Digite a quantidade: ");
        quantidade = leitor.nextInt();
        
        if(quantidade <= 10){
            valorUnidade = 8.00;
        }
        else if(quantidade > 10){
            valorUnidade = 12.00;
        }
        total = valorUnidade*quantidade;
        System.out.println("Total a pagar: " + total + "reais");
        leitor.close();
    };
}
