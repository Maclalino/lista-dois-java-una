import java.util.Scanner;
public class ExercicioUmListaDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroUm, numeroDois, numeroTres, menorNum, maiorNum,mediaArit;
        System.out.println("\nAlgoritmo que identifica o maior numero,menor número e a média Aritmética dos três numéros informados");
        System.out.println("\nInforme o primeiro número: ");
        numeroUm = scanner.nextInt();
        System.out.println("\nInforme o segundo número: ");
        numeroDois = scanner.nextInt();
        System.out.println("Informe oterceiro número: ");
        numeroTres = scanner.nextInt();

        if ((numeroUm > numeroDois)&&(numeroUm > numeroTres)){
            maiorNum = numeroUm;
            System.out.println("\nO maior número é:" + maiorNum);
        }
        else if ((numeroDois > numeroUm)&& (numeroDois > numeroTres)){
            maiorNum = numeroDois;
            System.out.println("\nO maior número é:" + maiorNum);
        }
        else {
            maiorNum = numeroTres;
            System.out.println("\nO maior número é:" + maiorNum);
        }

        if ((numeroUm < numeroDois)&&(numeroUm < numeroTres)){
            menorNum = numeroUm;
            System.out.println("\nO menor número é:" + menorNum);
        }
        else if ((numeroDois < numeroUm)&& (numeroDois < numeroTres)){
            menorNum = numeroDois;
            System.out.println("\nO menor número é:" + menorNum);
        }
        else {
            menorNum = numeroTres;
            System.out.println("\nO menor número é:" + menorNum);
        }

        mediaArit = (numeroUm + numeroDois + numeroTres) / 3;
        System.out.println("\nA média Aritmética é igual:" + mediaArit);
    
    scanner.close();
    }


}
