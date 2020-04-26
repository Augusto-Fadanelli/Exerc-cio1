//53 - Exiba a tabuada de um número fornecido pelo usuário.
import java.util.Scanner;

public class Questao53
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o numero: ");
        int numero = input.nextInt();
        System.out.println();
        
        for(int i=1; i<11; i++){
            System.out.println(numero + "*" + i + " = " + (numero * i));
        }
    }
}
