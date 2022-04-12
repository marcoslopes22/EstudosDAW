package exercicio02;

public class Questaoseis {
    public static void main(String[]args){
        String funcionario = "Funcionário";
        int valorHora=25;
        int horasTrabalhadasMes=8*22;
        double salario=0;
        salario = horasTrabalhadasMes * valorHora;

        System.out.println("Salário do " + funcionario + " neste mês: " + salario + " reais");
    }
}
