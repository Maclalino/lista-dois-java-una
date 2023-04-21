import java.util.Scanner;
public class ExercicioQuatroListaDois {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
       double  pi, raio, perimetro, area, volume;
       pi = 3.141592;
        System.out.println("\nDigite 1 para calcular o perímetro: \nPara calcular a área digite 2: \nPara calcular o volume digite 3:");
        int indicador = scanner.nextInt();
        System.out.println("\nDigite o segundo número, raio do círculo ou esfera.");
        raio = scanner.nextDouble();
         
        switch (indicador) {

            case 1: perimetro = 2 * pi * raio;
            System.out.printf("O perimetro do circulo é %.2f" , perimetro);
            break;
            case 2: area = (Math.exp(raio)*pi);
            System.out.printf("A área é: %.2f\n" , area);
            break;
            case 3: volume = (4/3) * pi * (Math.pow(raio,3));
            System.out.printf("O volume é: %.2f\n" , volume);
            break;
            default:
            System.out.println("Erro,numero da operação é inválido");
            break;

        
        }
        scanner.close();
    }
}
