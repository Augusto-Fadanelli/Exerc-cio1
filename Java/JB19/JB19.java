/* Exiba dois números fornecidos pelo usuário em ordem crescente. */
 
import java.util.Scanner;

public class JB19
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Ordenar o1 = new Ordenar();
        
        System.out.print("Insira o primeiro número: ");
        o1.num1 = input.nextFloat();
        System.out.print("Insira o segundo número: ");
        o1.num2 = input.nextFloat();

        o1.exibir(o1.num1, o1.num2);
    }
}

