// 3 - Solicite a quantidade de homens e de mulheres de uma turma da faculdade. Em seguida calcule e exiba o percentual (separadamente) de homens e mulheres desta turma.
import java.util.Scanner;

public class Questao3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de alunos homens na turma: ");
        int homens = input.nextInt();
        System.out.print("Insira a quantidade de alunas mulheres na turma: ");
        int mulheres = input.nextInt();
        System.out.println();
        
        double total = homens + mulheres;
        double pM = 100 * mulheres / total; //Percentual de Mulheres
        double pH = 100 * homens / total; //Percentual de Homens
        
        System.out.println("Percentual de Alunos Homens: " + pH + "%");
        System.out.println("Percentual de Alunas Mulheres: " + pM + "%");
    }
}
