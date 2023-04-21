import java.util.Scanner;
public class ExercicioCincoListaDois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numeroUm, numeroDois, resultado;
        String operacao;
        System.out.println("\nDigite o primeiro numero:");
        numeroUm = input.nextDouble();
        System.out.println("\nDigite o segundo numero: ");
        numeroDois = input.nextDouble();
        System.out.println("\nDigite o simbolo da operação: ");
        operacao = input.next();

        switch ( operacao ){
            case "+" :
            resultado = numeroUm + numeroDois;
            break;
            case "*":
            resultado = numeroUm * numeroDois;
            break;
            case "/":
            resultado = numeroUm / numeroDois;
            break;
            case "^":
            resultado = Math.pow(numeroUm,numeroDois);
            break;
            default :
            System.out.println("Erro:  simbolo de operação inválido");
            return;
        }
        System.out.printf("O resultador da operção %.2f %s %.2f é %.2f\n", numeroUm, operacao, numeroDois, resultado);
    
        input.close();
    }
    
}
