// 4 - Determine e exiba a média aritmética de um aluno a partir de suas 4 notas.
// Calculo de média escolhido: (AP1 + AP2 + AP3 + AF)/4
import java.util.Scanner;

public class JB4
{
    public static void main(String[] args)
    {        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira a nota da AP1: ");
        double AP1 = input.nextDouble();
        System.out.print("Insira a nota da AP2: ");
        double AP2 = input.nextDouble();
        System.out.print("Insira a nota da AP3: ");
        double AP3 = input.nextDouble();
        System.out.print("Insira a nota da AF: ");
        double AF = input.nextDouble();
        
        double media = (AP1 + AP2 + AP3 + AF)/4;
        
        System.out.println("A media aritmetica do aluno e: " + media);
    }
}
