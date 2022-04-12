package exercicio02;
import java.util.Scanner;
import java.util.Calendar;

public class Questaoum {
    public static void main(String[] args){
        Scanner lerScanner = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();

        int valorDeposito;
    
        System.out.println("Digite o valor do depósito: ");
        valorDeposito = lerScanner.nextInt();

        double rendimento = 5.0/100.0;
        double valorTotal = valorDeposito + (rendimento*valorDeposito);

        System.out.println("Valor do deposito: "+valorDeposito+" reais");
        System.out.println("Efetuado em: "+calendario.getTime());

        calendario.set(Calendar.MONTH, 1);
        System.out.println("Valor total em "+calendario.getTime()+":"+ valorTotal+" reais.");

        lerScanner.close();
    }
}
