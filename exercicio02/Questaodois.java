package exercicio02;
import java.util.Scanner;

public class Questaodois {
    public static void main(String[] args){
        while(true){
            Scanner ler = new Scanner(System.in);
            int valorProduto = 0;
            double valorTotal = 0;
            double desconto = 0;
            int ddd;

            System.out.println("Digite o valor do produto: ");
            valorProduto = ler.nextInt();

            System.out.println("Digite o código da região do produto: ");
            ddd = ler.nextInt();

            if (ddd == 92||ddd ==97||ddd ==91||ddd ==93||ddd ==94||ddd ==69||ddd ==95) {
                System.out.println("Seu produto é da região Norte.");
                desconto = 5.0/100.0;
                valorTotal = valorProduto-(valorProduto*desconto);
                System.out.println("Desconto: "+desconto+" reais");
                System.out.println("Valor total: "+valorTotal+" reais");
            }
            else if(ddd ==41||ddd ==42||ddd ==43||ddd ==44||ddd ==45||ddd ==46||ddd ==51||ddd ==53||ddd ==54||ddd ==55||ddd ==47||ddd ==48||ddd ==49){
                System.out.println("Seu produto é da região Sul.");
                desconto = 15.0/100.0;
                valorTotal = valorProduto-(valorProduto*desconto);
                System.out.println("Desconto: "+desconto+" reais");
                System.out.println("Valor total: "+valorTotal+" reais");
            }
            else if(ddd ==11||ddd ==12||ddd ==13||ddd ==14||ddd ==15||ddd ==16||ddd ==17||ddd ==18||ddd ==19||ddd ==21||ddd ==22||ddd ==24||ddd ==27||ddd ==28||ddd ==31||ddd ==32||ddd ==33||ddd ==34||ddd ==35||ddd ==37||ddd ==38){
                System.out.println("Seu produto é da região Sudeste.");
                desconto = 7.0/100.0;
                valorTotal = valorProduto-(valorProduto*desconto);
                System.out.println("Desconto: "+desconto+" reais");
                System.out.println("Valor total: "+valorTotal+" reais");
            }
            else if(ddd ==71||ddd ==73||ddd ==74||ddd ==75||ddd ==77||ddd ==85||ddd ==88||ddd ==98||ddd ==99||ddd ==83||ddd ==81){
                System.out.println("Seu produto é da região Nordeste.");
                desconto = 12.0/100.0;
                valorTotal = valorProduto-(valorProduto*desconto);
                System.out.println("Desconto: "+desconto+" reais");
                System.out.println("Valor total: "+valorTotal+" reais");
            }
            else if(ddd ==65||ddd ==66||ddd ==67||ddd ==62|| ddd==61){
                System.out.println("Seu produto é da região Centro-oeste.");
                desconto = 20.0/100.0;
                valorTotal = valorProduto-(valorProduto*desconto);
                System.out.println("Desconto: "+desconto+" reais");
                System.out.println("Valor total: "+valorTotal+" reais");
            }
            else{
                System.out.println("Não é possível aplicar descontos em produtos importados.");
            }
        }
    }
}
