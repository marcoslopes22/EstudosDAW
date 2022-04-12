package exercicio02;

public class Questaocinco {
    public static void main(String[]args){
        String nome = "Pessoa";
        String genero = "H";
        int idade=27;
        double salarioBruto=1100;
        double abono=0;

        double inss=30;

        double salarioLiquido=0;

        switch (genero) {
            case "H":
                if(idade>=30){
                    abono = 100;
                }
                else if(idade<=30){
                    abono = 50;
                }
                salarioLiquido = salarioBruto + abono - inss;
                System.out.println("O salário líquido de " + nome + "é: " + salarioLiquido);
                break;
            case "M":
                if(idade>=30){
                    abono = 200;
                }
                else if(idade<=30){
                    abono = 80;
                }
                salarioLiquido = salarioBruto + abono - inss;
                System.out.println("O salário líquido de " + nome + "é: " + salarioLiquido);
                break;
            default:
                break;
        }

    }
}
