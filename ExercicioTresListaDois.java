import java.util.Scanner;
public class ExercicioTresListaDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAlgoritmo para uma equação de segundo grau");
    double coefa, coaefb, coefc,delta, x1, x2;
    System.out.println("\nInforme o coeficiente A: ");
    coefa = scanner.nextDouble();
    System.out.println("\nInforme o coeficiente B: ");
    coaefb = scanner.nextDouble();
    System.out.println("\nInforme o coeficiente C");
    coefc = scanner.nextDouble();
    delta= Math.pow(coaefb,2) - 4 * coefa * coefc;

    if ((coefa == 0) && (coaefb == 0) && (coefc != 0)){
        System.out.println("\nCoeficientes  infomados incorretamente");
    } 
     else if ( coefa == 0 && coaefb!=0){
        System.out.println("Essa é uma equaçao do primeiro grau");
        x1 = -coefc / coaefb;
        System.out.println("\nA raiz real da equação e:" + x1);
    }
    else {
    
        if (delta < 0){
            System.out.println("Está equação não possui raizes reais");
        }
        else if (delta == 0){
            System.out.println("\nEsta equação possui duas raizes iguais");
            x1 = - coaefb / (2 * coefa);
            System.out.println("As raizes da equação são: " + x1 +  " e" + x1);
        }
        else {
            System.out.println("\nEstá equação possui duas raizes diferentes");
            x1 = ( - coaefb + Math.sqrt(delta)) / (2 * coefa);
            x2 = (- coaefb - Math.sqrt(delta) / (2 * coefa));
            System.out.println("\nAs raizes da equeção são:" + x2 + "e" + x2);


        }

    }
    
    scanner.close();
    
    }

}
