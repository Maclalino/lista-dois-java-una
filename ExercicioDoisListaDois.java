import java.util.Scanner;
public class ExercicioDoisListaDois {
    public static void main(String[] args) {
        System.out.println("\nAlgoritmo máquina de lanche");
    Scanner scanner = new Scanner(System.in);
    int valorComp, valorPag, notaCinquenta, notaVinte, notaDez, notaCinco, notaDois, notaum, troco;
    System.out.println("\nInforme o valor da compra:");
    valorComp = scanner.nextInt();
    System.out.println("\nINforme o valor pago:");
    valorPag = scanner.nextInt();
    
    troco = valorPag - valorComp;
 
    if (valorPag < valorComp){
     System.out.println("\nValor insuficiente");
    }

    else  {
        
        notaCinquenta = troco / 50; 
        troco = troco % 50;
        notaVinte = troco / 20;
        troco = troco % 20;
        notaDez = troco / 10;
        troco = troco % 10;
        notaCinco = troco / 5;
        troco = troco % 5;
        notaDois = troco / 2;
        troco = troco % 2;
        notaum = troco / 1;
        troco = troco % 1;
             System.out.println("Notas de 50: " + notaCinquenta );
             System.out.println("Notas de 20: " + notaVinte);
             System.out.println("Notas de 10: " + notaVinte );
             System.out.println("Notas de 5: " + notaCinco );
             System.out.println("Notas de 2: " + notaDois);
             System.out.println("Notas de 1: " + notaDois);
    }
    
    
    scanner.close();
    
    }
}
    
    
    
    
    
    
    
    
    
    
    
    







