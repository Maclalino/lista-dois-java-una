import java.util.Random;
import java.util.Scanner;
public class ExercicioSeisListaDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random sorteio = new Random();
       double n1,n2, menor, maior, sorteado;
        System.out.println("Digite o primeiro número:");
    n1 = scanner.nextDouble();
    System.out.println("Digite o segundo número:");
    n2 = scanner.nextDouble();
     maior = Math.max(n1,n2);
     menor = Math.max(n1,n2);

     sorteado = sorteio.nextDouble(maior-menor+1)+menor;
      sorteado = Math.floor(sorteado);

      if (sorteado %2==0){
        System.out.printf("O número gerado é: %s, e ele é par.", sorteado);
      }
      else{
        System.out.printf("O número gerado é: %s, e ele é ímpar" , sorteado);
      }
    scanner.close();
    
    }
}
